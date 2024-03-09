import os
from openai import OpenAI
import private_information as private_information
import ask_gpt as gpt
import fnmatch
import concurrent.futures

# According to docs can be as high as 4096 but I want it to be significantly smaller
max_chars = 2000

def write_output_w_promt(full_prompt, output_file, file_path="None specified"):
    # Send the prompt to the OpenAI API
    # TODO: Can write all messages at once
    response = gpt.chatgpt(full_prompt)

    # Write the response to the output file
    with open(output_file, 'a') as output:
        output.write(f'Response for {file_path}:\n{response}\n\n')

    # Print the response
    print(f'Response for {file_path}:\n{response}\n')

def process_file(file_path, prompt, output_file):
    """
    Sends the content of the file to the OpenAI API with the given prompt and writes the response to the output file.
    """
    with open(file_path, 'r') as file:
        file_content = file.read()

    # Split the content based on the maximum number of characters
    parts = [file_content[i:i + max_chars] for i in range(0, len(file_content), max_chars)]

    for file_content in parts:

        # Concatenate the prompt with the file content
        full_prompt = prompt + '\n\n' + file_content

        write_output_w_promt(full_prompt, output_file, file_path)

def process_files(file_paths, prompt, output_file, parallel_amount=2):
    """
    Sends the content of the lots of files in parallel to the OpenAI API with the given prompt and writes the response to the output file.
    """

    # This is a list of all file content
    all_content = []

    for file_path in file_paths:
        with open(file_path, 'r') as file:
            file_content = file.read()

        # Split the content based on the maximum number of characters
        for i in range(0, len(file_content), max_chars):
            # This separates into smaller parts and adds the prompt
            all_content.append((prompt + file_content[i:i + max_chars], file_path))

    # Split into chunks to run in parallel
    # TODO: just make this in chunks to start with
    chunks = [all_content[i:i + parallel_amount] for i in range(0, len(all_content), parallel_amount)]

    def process_chunk(chunk):
        for content, path in chunk:
            write_output_w_promt(content, output_file, path)

    with concurrent.futures.ThreadPoolExecutor() as executor:
        executor.map(process_chunk, chunks)

def process_directory(directory_path, prompt, output_file, parallel_amount=100):
    """
    Recursively processes each file in the directory and its subdirectories.
    """

    # if there is a value specified for parallel amount then it will run them
    if parallel_amount:
        file_paths = []
        for root, dirs, files in os.walk(directory_path):

            for file in files:
                # This makes sure it only runs it for java files
                # TODO: make this able to run with other files
                if fnmatch.fnmatch(file, '*.java'):
                    file_paths.append(os.path.join(root, file))
        process_files(file_paths, prompt, output_file, parallel_amount)

    else:
        for root, dirs, files in os.walk(directory_path):
            for file in files:
                # This makes sure it only runs it for java files
                # TODO: make this able to run with other files
                if fnmatch.fnmatch(file, '*.java'):
                    file_path = os.path.join(root, file)
                    process_file(file_path, prompt, output_file)

def main():
    # Set your folder or file path here
    path = input('input the path to your file here: ')
    if path == '':
        path = 'extracted_csc_go'
        path = 'testing'

    prompt = input('for a custom prompt input here: ')
    if prompt == '':
        prompt = 'Using the below java text I want you to give me any ip addresses or dynamic ways to connect to outside servers and if there are none then just say there are none'
    
    output_file = input('input the output file here: ')
    if output_file == '':
        output_file = 'output.txt'

    

    # Clear the output file
    open(output_file, 'w').close()

    if os.path.isdir(path):
        process_directory(path, prompt, output_file)
    elif os.path.isfile(path):
        process_file(path, prompt, output_file)
    else:
        print('Invalid path')

if __name__ == '__main__':
    main()

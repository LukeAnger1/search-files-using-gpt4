import os
from openai import OpenAI
import private_information as private_information
import ask_gpt as gpt
import fnmatch

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

def process_directory(directory_path, prompt, output_file):
    """
    Recursively processes each file in the directory and its subdirectories.
    """
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
        # path = 'testing'

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

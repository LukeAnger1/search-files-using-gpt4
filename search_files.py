import os
import openai

# Set your OpenAI API key here
openai.api_key = 'your_api_key_here'

def process_file(file_path, prompt, output_file):
    """
    Sends the content of the file to the OpenAI API with the given prompt and writes the response to the output file.
    """
    with open(file_path, 'r') as file:
        file_content = file.read()

    # Concatenate the prompt with the file content
    full_prompt = prompt + '\n\n' + file_content

    # Send the prompt to the OpenAI API
    response = openai.Completion.create(engine="davinci", prompt=full_prompt, max_tokens=150)

    # Write the response to the output file
    with open(output_file, 'a') as output:
        output.write(f'Response for {file_path}:\n{response.choices[0].text}\n\n')

    # Print the response
    print(f'Response for {file_path}:\n{response.choices[0].text}\n')

def process_directory(directory_path, prompt, output_file):
    """
    Recursively processes each file in the directory and its subdirectories.
    """
    for root, dirs, files in os.walk(directory_path):
        for file in files:
            file_path = os.path.join(root, file)
            process_file(file_path, prompt, output_file)

def main():
    # Set your folder or file path here
    path = 'path/to/your/folder_or_file'
    prompt = 'Your custom prompt here'
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

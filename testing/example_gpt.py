import private_information as private_information
from openai import OpenAI
import private_information as private_information

# Set your OpenAI API key here
client = OpenAI(
    # This is the default and can be omitted
    api_key=private_information.openai_api_key,
)

def chatgpt_test(prompt):
    chat_completion = client.chat.completions.create(
    messages=[
        {
            "role": "user",
            "content": prompt,
        }
    ],
    model="gpt-3.5-turbo",
    )

    # This extracts the response
    response = chat_completion.choices[0].message.content
    return response

# Test the function
prompt = "Hello, ChatGPT! How are you"
response = chatgpt_test(prompt)
print(f"Prompt: {prompt}")
print(f"Response: {response}")

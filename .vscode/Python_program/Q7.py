questions = {
    "What is the capital of France?": "Paris",
    "What is 2 + 2?": "4",
    "What color is the sky?": "Blue"
}

score = 0

for question, answer in questions.items():
    user_answer = input(question + " ")
    if user_answer.lower() == answer.lower():
        print("Correct!")
        score += 1
    else
        print("Wrong! The correct answer is:", answer)

print("You scored", score, "out of", len(questions).)
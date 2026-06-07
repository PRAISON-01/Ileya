#Function
#mbti_personality_test_function

def get_questions():
    questions = [
        ["A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"],
        ["A. Interpret literally", "B. look for meaning and possibilities"],
        ["A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"],
        ["A. organized, orderly", "B. flexible, adaptable"],
        ["A. more outgoing, think out loud", "B. more reserved, think to yourself"],
        ["A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"],
        ["A. candid, straight forward, frank", "B. tactful, kind, encouraging"],
        ["A. plan, schedule", "B. unplanned, spontaneous"],
        ["A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"],
        ["A. standard, usual, conventional", "B. different, novel, unique"],
        ["A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"],
        ["A. regulated, structured", "B. easy-going, live and let live"],
        ["A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"],
        ["A. focus on here-and-now", "B. look to the future, global perspective, big picture"],
        ["A. tough-minded, just", "B. tender-hearted, merciful"],
        ["A. preparation, plan ahead", "B. go with the flow, adapt as you go"],
        ["A. active, initiate", "B. reflective, deliberate"],
        ["A. facts, things, what is", "B. ideas, dreams, what could be, philosophical"],
        ["A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"],
        ["A. control, govern", "B. latitude, freedom"]
    ]

    return questions

def collect_choices():
    questions = get_questions()
    choices = []
    for question in questions:

        user_input = input(f"{question[0]}, {question[1]}").lower()
        
        while user_input != "a" and user_input != "b":

            print("Expected A or B as response\nI know this is an error, please try again\n\n\n")
            user_input = input(f"{question[0]}, {question[1]}\n\n").lower()
        choices.append(user_input)

    return choices


def extrovert_vs_introvert_personality(answers):
    indexes = [0, 4, 8, 12, 16]

    a_count = 0
    b_count = 0
    reply = []    

    for index in indexes:

        if answers[index] == "a":
            a_count +=1 
        elif answers[index] == "b":
            b_count += 1

        if answers[index] == "a":
            reply.append(question[index][0])
        elif answers[index] == "b":
            reply.append(question[index][1])

    return [reply, a_count]



   

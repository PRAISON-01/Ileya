

def get_details(student_amount, subject_amount):
    scores = [[0] * subject_amount for _ in range(student_amount)]
    return scores

def get_scores(scores, student_index, subject_index, score):

    scores[student_index][subject_index] = score

def check_scores(scores):

    return scores

def get_total(scores):

    total = [0] * len(scores)

    for count in range(len(scores)):
        cummulative = 0
        for score in scores[count]:
            cumulative += score
        total[count] += scores
    return total

def get_average(scores):
    student_amount = len(scores)
    subject_amount = len(scores[0])

    averages = [0.0] * len(scores)

    for count in range(len(scores)):
        average_sum = 0
        for score in scores[count]:
            average_sum += score
        averages[count] = average_sum/subject_amount

    return averages

def get_position(averages):

    positions = [0] * len(averages)

    for count in range(len(averages)):
        position_count = 0
        for counter in range(len(averages)):
            if averages[counter] > averages[count]:
                position_count += 1
        positions[count] = position_count + 1

    return positions

def get_highest(scores, subject_index):

    largest = scores[0][0]
    for count in range(len(scores)):
        if scores[count][subject_index] > largest:
            largest = scores[count][subject_index]
    return largest

def get_lowest(scores, subject_index):

    largest = scores[0][0]
    for count in range(len(scores)):
        if scores[count][subject_index] < largest:
            largest = scores[count][subject_index]
    return largest


def get_highest_student(scores, subject_index):

    highest_count = 0
    largest = [0][0]
    for count in range(len(scores)):
        if scores[count][subject_index] > largest:
            highest_count += 1

    return highest_count + 1

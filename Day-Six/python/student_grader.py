import student_grader_function

student_amount = int(input("How many students do you have? >> \n"))
subject_amount = int(input("How many subject do they offer"))
scores =
student_count = 0
subject_count = 0

print("Saving >>>>>>>>>>>>>>>>>")
print("Saved sussessfully!")

while student_count <= student_amount:
    subject_count = 0
    print(f"Entering score for student {student_count}")

    while subject_count <= subject_amount:
        score = int(input("Enter score for subject {subject_count}\n"))
        print("Saving >>>>>>>>>>>>>>>>>")
        print("Saved sussessfully!")
        get_details(student_count, student_count, score)

from credit_card_validator import *


print("""
In 1954, Hans Luhn of IBM proposed an algorithm for
validating credit card numbers. The algorithm is useful to
determine whether a card number is entered correctly.
Credit card numbers are generated following this validity
check, commonly known as the Luhn check or the Mod 10
check, which can be described as follows:


Consider the credit number - 4388576018402626
1. Double every second digit from right to left. If doubling
of the digit results in a two-digit number, add up the two
digits to get a single-digit number.


2. Now add all single-digit numbers from Step 1:
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

3. Add all digits in the odd places from right to left in the
card number.
6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38

4. Sum the results from Steps 2 and 3:
37 + 38 = 75

5. If the result from Step 4 is divisible by 10, the card
number is valid; otherwise, it is invalid. For example, the
number 4388576018402626 is invalid, but the number
4388576018410707 is valid


This program has managed to implement this algorithm

(enter any input to continue)
""")
input()
choice = "yes"
while choice.lower() == "yes":
    
    print()
    print()
    card_number = int(input("Hello, kindly enter card details to verify => "))

    print(f"Credit Card Type: {get_card_type(card_number)}")
    print(f"Credit Card Number: {card_number}")
    print(f"Credit Card Digit Length: {get_card_length(card_number)}")
    print(f"Credit Card Validity Status: {get_card_validity(card_number)}")
    choice = input("Would you like to continue using the program! => ")

print("Thank you for using the cresit card validator")

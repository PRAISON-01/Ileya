const { getCardType, getCardLength, isValid } = require("./CreditCardValidator");

const input = require("prompt-sync")();

const intro = `  
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

`;

input(intro)

let choice = "yes";
while(choice.toLowerCase() == "yes"){

    let cardNumber = Number(input("Hello kinfly Enter card details to verify => "));

    console.log(`Credit Card Type: ${getCardType(cardNumber)}`);
    console.log(`Credit Card Number: ${cardNumber}`);
    console.log(`Credit Card Digit Length: ${getCardLength(cardNumber)}`);
    console.log(`Credit Card Validity Status: ${isValid(cardNumber)}`);   

    choice = input("Would you like to constinue the program => ") 
}

console.log("Thanks for using the program ")

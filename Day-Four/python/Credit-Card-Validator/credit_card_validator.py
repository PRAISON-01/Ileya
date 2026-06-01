
def get_card_type(card_number):

    card_type = str(card_number)

    if card_type.startswith("4"):
        return "Visa Card"
    elif card_type.startswith("5"):
        return "MasterCard"
    elif card_type.startswith("37"):
        return "American Express Card"
    elif card_type.startswith("6"):
        return "Discover Card"

    return "Invalid card"

def get_card_length(card_number):

    return len(str(card_number))

def get_card_validity(card_number):
    
    total = 0
    valid_total = 0
    odd_total = 0
    card_number = str(card_number)
    numbers = []
    size = len(str(card_number))
    for count in range(size - 2, -1, -2):

        numbers.append(int(card_number[count]) * 2)
        
    for number in numbers:
    
        number = str(number)
        if len(number) == 2:
                
            for digit in number:
                digit = int(digit)
                total += digit
        else:
            total += int(number)
            
    for index in range(size - 1, -1, -2):
    
        odd_total += int(card_number[index])

    valid_total = odd_total + total

    if valid_total % 10 == 0:
        return "Valid"

    return "Invalid"
    



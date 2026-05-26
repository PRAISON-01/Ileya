import math

def split_array(array):
    even_array = []
    odd_array = []
    new_array = []
    for number in array:
        if number % 2 == 0:
            even_array.append(number)
        else:
            odd_array.append(number)

    new_array.append(odd_array)
    new_array.append(even_array)
    return new_array

def is_palindromic(array):
    count = 0
    size = len(array)
    index = size - 1
    
    while count < index:
    
        if array[count] != array[index]:
            return False
        count += 1
        index -= 1
        
    return True

def get_perfect_square(array):
    new_list = []
    for number in array:
        if number >= 0:
            root = math.sqrt(number)
            if root * root == number:

                new_list.append(number)
        
    return new_list

def replace_non_perfect_square(array):

    new_list = []
    for number in array:
        if number >= 0:
            root = math.sqrt(number)
            if root * root == number:
                new_list.append(number)
            else:
                new_list.append(-1)

    return new_list

array = [4, 7, 9, 10, 16, 18]
print(replace_non_perfect_square(array))

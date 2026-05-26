def get_duplicate(array):
    new_list = []
    duplicate_list = []
    for number in array:
        if number in new_list:
            if number not in duplicate_list:
                duplicate_list.append(number)
        else:
            new_list.append(number)

    return duplicate_list 


def sort_array(array):
    
    size = len(array)
    for count in range(0, size, 1):

        for index in range(count + 1, size, 1):

            if array[index] >  array[count]:
                array[count], array[index] = array[index], array[count]

    return array
                


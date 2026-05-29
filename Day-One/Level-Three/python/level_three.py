def get_flatten_array(array):
    new_list = []
    for element in array:
        for stuff in element:
            new_list.append(stuff)

    return new_list

def sort_2d_merged_list(array):

    new_list = []
    for element in array:
        for stuff in element:
            new_list.append(stuff)

    size = len(new_list)
    for count in range(0, size, 1):
        for index in range(count + 1, size, 1):
            if new_list[index] < new_list[count]:

                new_list[count], new_list[index] = new_list[index], new_list[count]

    return new_list

def sort_merged_list(array_one, array_two):
    
    new_list = []
    final_list = []

    new_list.append(array_one)
    new_list.append(array_two)
    for element in new_list:
        for stuff in element:
            final_list.append(stuff)

    size = len(final_list)
    for count in range(0, size, 1):
        for index in range(count + 1, size, 1):
            if final_list[index] < final_list[count]:
  
                final_list[count], final_list[index] = final_list[index], final_list[count]

    return final_list     

def         




    



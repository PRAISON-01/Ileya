def count_vowels_and_consonant(word):

    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    
    for char in word:

        lower = char.lower().replace(" ","")
        if lower.isalpha():
            if lower in vowels:
                vowel_count += 1

            else:
                consonant_count += 1

    return [["Vowel", vowel_count],["Consonant", consonant_count]]


def get_two_sum_index(numbers, target):

    size = len(numbers)
    for count in range(0, size, 1):
        for index in range(count + 1, size, 1):
            if numbers[count] + numbers[index] == target:
                return [count, index]
    return []


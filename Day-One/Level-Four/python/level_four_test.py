from unittest import TestCase

import level_four

class TestLevelFour(TestCase):

    def test_that_function_returns_array_of_vowel_and_consonant_count(self):

        word = "Hello World"
        expected = [["Vowel", 3],["Consonant", 7]]
        actual = level_four.count_vowels_and_consonant(word)
        self.assertEqual(actual, expected)

    def test_that_get_two_sum_index_returns_the_index_of_the_two_numbers_that_makes_up_the_target(self):

        array = [2, 7, 9, 11, 15]
        target = 9
        actual = level_four.get_two_sum_index(array, target)
        self.assertTrue(actual)

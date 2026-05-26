from unittest import TestCase

import level_four

class TestLevelFour(TestCase):

    def test_that_function_returns_array_of_vowel_and_consonant_count(self):

        word = "Hello World"
        expected = [ ["vowels" , 3], ["consonants", 7] ]
        actual = level_four.get_word_count(word)
        self.assertEqual(actual, expected)


from unittest import TestCase

import level_one

class TestLevelOne(TestCase):

    def test_that_new_list_contains_splt_list_of_even_and_odd(self):
        array = [45, 60, 3, 10, 9, 22]
        expected = [[45, 3 , 9] , [60 , 10, 22 ]]
        actual = level_one.split_array(array)
        self.assertEqual(actual, expected)

    def test_that_palindromic_list_returns_true(self):
        array = [45, 0, 8, 0, 45 ]
        actual = level_one.is_palindromic(array)
        self.assertTrue(actual)

    def test_that_not_palindromic_list_returns_false(self):
        array = [45, 60, 3, 10, 9, 22]
        actual = level_one.is_palindromic(array)
        self.assertFalse(actual)

    def test_that_function_returns_new_list_of_perfect_square(self):
        array = [4, 7, 9, 10, 16, 18]
        expected = [4, 9, 16]
        actual = level_one.get_perfect_square(array)
        self.assertEqual(actual, expected)

    def test_that_function_replaces_non_perfect_square_with_minus_one(self):
        array = [4, 7, 9, 10, 16, 18]
        expected = [4, -1, 9, -1, 49 , -1]
        actual = level_one.replace_non_perfect_square(array)
        self.assertEqual(actual, expected)

        

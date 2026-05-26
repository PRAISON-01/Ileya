import unittest
import level_two

class TestLevelTwoFunctions(unittest.TestCase):

    def test_that_new_list_returns_duplicate_elemnents(self):
    
        input_one = [1, 2, 3, 2, 4, 3]
        expected = level_two.get_duplicate(input_one)
        actual = [2, 3]
        self.assertListEqual(actual, expected)

        input_two = [4, 6, 7, 8 ,4, 3, 5, 4]
        expected_two = level_two.get_duplicate(input_two)
        actual_two = [4]
        self.assertEqual(actual_two, expected_two)
        
    
        
    def test_that_the_zeros_are_pushed_to_the_end(self):
    
        input_one = [5, 0 , 3, 0, 2, 0]
        expected = level_two.sort_array(input_one)
        actual = [5, 3 , 2 , 0, 0 , 0]
        self.assertListEqual(actual, expected)
        
        original_list = [4, 7, 9, 10, 49, 6]
        expected_two = level_two.sort_array(original_list)
        actual_two = [49, 10, 9, 7, 6, 4]
        self.assertEqual(actual_two, expected_two)

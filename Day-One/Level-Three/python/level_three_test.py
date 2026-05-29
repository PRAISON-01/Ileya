from unittest import TestCase

import level_three

class TestLevelThree(TestCase):

    def test_that_new_list_changes_2d_array_to_single_array(self):
        
        array = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]
        actual = level_three.get_flatten_array(array)
        expected = [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6]
        self.assertEqual(actual, expected)

    def test_that_2d_array_return_single_sorted_list(self):

        array = [[3, 5, 1], [2, 4, 6]]
        expected = [1, 2, 3, 4, 5, 6]
        actual = level_three.sort_2d_merged_list(array)
        self.assertEqual(actual, expected)

    def test_that_new_list_returns_merged_sorted_arrray(self):

        array = [3, 5, 1]
        array_two = [2, 4, 6]
        expected = [1, 2, 3, 4, 5, 6]
        actual = level_three.sort_merged_list(array, array_two)
        self.assertEqual(actual, expected)

    def test_that_rotate_array_returns_array_rotated_2_times(self):
        
        array = [1, -9, 3, 0, 8]
        index = 2
        actual = level_three.rotate_array(array, index)
        self.assertTrue(actual)

    def test_that_rotate_array_returns_array_rotated_5_times(self):
        
        array = [1, -9, 3, 0, 8]
        index = 5
        actual = level_three.rotate_array(array, index)
        self.assertTrue(actual)

    def test_that_rotate_array_returns_array_rotated_0_times(self):
        
        array = [1, -9, 3, 0, 8]
        index = 0
        actual = level_three.rotate_array(array, index)
        self.assertTrue(actual)

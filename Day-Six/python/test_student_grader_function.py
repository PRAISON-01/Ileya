from unittest import TestCase

from student_grader_function import *

class TestGetDetails(TestCase):

    def test_that_get_details_returns_correctly(self):

        actual = get_details(4, 3);
        expected = [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
        self.assertEqual(expected, actual);

    def test_that_get_detail_of_2_student_for_2_subject_returns_correctly(self):

        scores = get_details(2, 2)
        get_scores(scores,0,0,50)
        get_scores(scores, 0,1,90)
        get_scores(scores,1,0,45)
        get_scores(scores,1,1,70)

        actual = check_scores(scores)
        expected = [[50, 90], [45, 70]]

        self.assertEqual(expected, actual)

    def test_test_that_get_total_returns_total_of_all_scores_in_the_scores(self):

        scores = get_details(4, 3)
        get_scores(scores, 0, 0, 67)
        get_scores(scores, 0, 1, 21)
        get_scores(scores, 0, 2, 49)
        get_scores(scores, 1, 0, 98)
        get_scores(scores, 1, 1, 62)
        get_scores(scores, 1, 2, 56)
        get_scores(scores, 2, 0, 93)
        get_scores(scores, 2, 1, 34)
        get_scores(scores, 2, 2, 27)
        get_scores(scores, 3, 0, 78)
        get_scores(scores, 3, 1, 83)
        get_scores(scores, 3, 2, 66)

        actual = check_scores(scores)
        expected = [[67, 21, 49], [98, 62, 56], [93, 34, 27], [78, 83, 66]]
        self.assertEqual(expected, actual)


    def test_that_get_averages_returns_total_divided_by_the_subject_amount(self):
        scores = get_details(4, 3)
        get_scores(scores, 0, 0, 67)
        get_scores(scores, 0, 1, 21)
        get_scores(scores, 0, 2, 49)
        get_scores(scores, 1, 0, 98)
        get_scores(scores, 1, 1, 62)
        get_scores(scores, 1, 2, 56)
        get_scores(scores, 2, 0, 93)
        get_scores(scores, 2, 1, 34)
        get_scores(scores, 2, 2, 27)
        get_scores(scores, 3, 0, 78)
        get_scores(scores, 3, 1, 83)
        get_scores(scores, 3, 2, 66)

        actual = check_scores(scores)
        expected = [[67, 21, 49], [98, 62, 56], [93, 34, 27], [78, 83, 66]]
        self.assertEqual(expected, actual)

        actual_averages = get_average(scores)
        expected_averages = [45.666666666666664, 72.0, 51.333333333333336, 75.66666666666667]
        self.assertEqual(expected_averages, actual_averages)

    def test_that_get_postion_returns_the_correct_corresponding_average_from_highest_to_lowest(self):

        scores = get_details(4, 3)
        get_scores(scores, 0, 0, 67)
        get_scores(scores, 0, 1, 21)
        get_scores(scores, 0, 2, 49)
        get_scores(scores, 1, 0, 98)
        get_scores(scores, 1, 1, 62)
        get_scores(scores, 1, 2, 56)
        get_scores(scores, 2, 0, 93)
        get_scores(scores, 2, 1, 34)
        get_scores(scores, 2, 2, 27)
        get_scores(scores, 3, 0, 78)
        get_scores(scores, 3, 1, 83)
        get_scores(scores, 3, 2, 66)

        actual_averages = get_average(scores)
        expected_averages = [45.666666666666664, 72.0, 51.333333333333336, 75.66666666666667]
        self.assertEqual(expected_averages, actual_averages)

        actual_position = get_position(scores)
        expected_position = [4, 1, 2, 3]
        self.assertEqual(expected_position, actual_position)

    def test_that_get_highest_returns_returns_hihest_score_at_index_one_for_subject_one(self):
        scores = get_details(4, 3)
        get_scores(scores, 0, 0, 67)
        get_scores(scores, 0, 1, 21)
        get_scores(scores, 0, 2, 49)
        get_scores(scores, 1, 0, 98)
        get_scores(scores, 1, 1, 62)
        get_scores(scores, 1, 2, 56)
        get_scores(scores, 2, 0, 93)
        get_scores(scores, 2, 1, 34)
        get_scores(scores, 2, 2, 27)
        get_scores(scores, 3, 0, 78)
        get_scores(scores, 3, 1, 83)
        get_scores(scores, 3, 2, 66)

        actual = get_highest(scores, 0)
        expected = 98
        self.assertEqual(expected, actual)

    def test_that_get_lowest_returns_the_lowest_score_at_the_index_for_subject_one(self):

        scores = get_details(4, 3)
        get_scores(scores, 0, 0, 67)
        get_scores(scores, 0, 1, 21)
        get_scores(scores, 0, 2, 49)
        get_scores(scores, 1, 0, 98)
        get_scores(scores, 1, 1, 62)
        get_scores(scores, 1, 2, 56)
        get_scores(scores, 2, 0, 93)
        get_scores(scores, 2, 1, 34)
        get_scores(scores, 2, 2, 27)
        get_scores(scores, 3, 0, 78)
        get_scores(scores, 3, 1, 83)
        get_scores(scores, 3, 2, 66)

        actual = get_lowest(scores, 0)
        expected = 67
        self.assertEqual(expected, actual)

    def test_that_get_highest_student_returns_the_highest_student_for_student_one(self):

        scores = get_details(4, 3)
        get_scores(scores, 0, 0, 67)
        get_scores(scores, 0, 1, 21)
        get_scores(scores, 0, 2, 49)
        get_scores(scores, 1, 0, 98)
        get_scores(scores, 1, 1, 62)
        get_scores(scores, 1, 2, 56)
        get_scores(scores, 2, 0, 93)
        get_scores(scores, 2, 1, 34)
        get_scores(scores, 2, 2, 27)
        get_scores(scores, 3, 0, 78)
        get_scores(scores, 3, 1, 83)
        get_scores(scores, 3, 2, 66)

        actual = get_highest(scores, 0)
        expected = 98
        self.assertEqual(expected, actual)

        actual = get_highest_student(scores, 0)
        expected = 2
        self.assertEqual(expected, actual)

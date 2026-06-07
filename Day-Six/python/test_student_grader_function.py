from unittest import TestCase

from student_grader_funtion import *

class TestGetDetails(TestCase):

    def test_that_get_details_returns_correctly(self):

        actual = student_grader_funtion.get_details(4, 3);
        expected = [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
        self.assertEqual(expected, actual);

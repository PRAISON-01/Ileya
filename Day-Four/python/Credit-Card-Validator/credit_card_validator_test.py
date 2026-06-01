from unittest import TestCase

from credit_card_validator import *

class TestThatcredit_card_validatorWorks(TestCase):

    def test_that_get_card_type_returns_Visacard_if_card_starstWith_4(self):

        actual = get_card_type("4388576018402626")
        self.assertTrue(actual)      
    
    def test_that_get_card_type_returns_MasterCard_if_card_starstWith_5(self):

        actual = get_card_type("5388576018402626")
        self.assertTrue(actual)          

    def test_that_get_card_type_returns_American_Express_Card_if_card_starstWith_37(self):

        actual = get_card_type("378576018402626")
        self.assertEqual(actual, "American Express Card")          

    def test_that_get_card_type_return_invalid_card_if_card_starstWith_32(self):

        actual = get_card_type("328576018402626")
        self.assertEqual(actual, "Invalid card")

    def test_that_get_card_type_returns_invalidCard_if_card_starstWith_any_other_number(self):

        actual = get_card_type("778576018402626")
        self.assertEqual(actual, "Invalid card")       

    def test_that_valid_card_number_returns_valid(self):
        
        actual = get_card_validity("4388576018410707")
        self.assertEqual(actual, "Valid")   

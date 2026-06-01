from unittest import TestCase

import check_out_function

class TestCheckOut(TestCase):

    def test_that_get_sub_total_returns_su_total_of_the_prices(self):
        item_price_list = [5000.00, 12500.00, 3200.00, 1800.00]
        actual = check_out_function.get_sub_total(item_price_list)
        expected = 22500.0
        self.assertEqual(actual, expected)

    def test_that_get_rate_returns_ratel_in_percentage(self):
        rate = 8
        actual = check_out_function.get_rate(rate)
        expected = 0.08
        self.assertEqual(actual, expected)

    def test_that_get_discount_returns_prices_after_applying_rate(self):
        item_price_list = [5000.00, 12500.00, 3200.00, 1800.00]
        rate = 8
        actual = check_out_function.get_discount(item_price_list, rate)
        expected = 1800.0
        self.assertEqual(actual, expected)

    def test_that_get_vat_returns_prices_afterr_applying_calue_add_tax(self):
        item_price_list = [5000.00, 12500.00, 3200.00, 1800.00]
        vat = check_out_function.get_vat(item_price_list)
        expected = 3937.5
        self.assertEqual(vat, expected)

    def test_that_get_bill_total_returns_the_total_bill(self):
        item_price_list = [5000.00, 12500.00, 3200.00, 1800.00]
        rate = 8
        actual = check_out_function.get_bill_total(item_price_list, rate)
        expected = 24637.5
        self.assertEqual(actual, expected)

    def test_that_get_change_returns_difference_when_total_bill_is_greater(self):
        item_price_list = [5000.00, 12500.00, 3200.00, 1800.00]
        rate = 8
        deposit = 20000
        actual = check_out_function.get_change(deposit, item_price_list, rate)
        expected = 4637.5
        self.assertEqual(actual, expected)

    def test_that_get_change_returns_difference_when_total_bill_is_greater(self):
        item_price_list = [5000.00, 12500.00, 3200.00, 1800.00]
        rate = 8
        deposit = 30000
        actual = check_out_function.get_change(deposit, item_price_list, rate)
        expected = 5362.5
        self.assertEqual(actual, expected)

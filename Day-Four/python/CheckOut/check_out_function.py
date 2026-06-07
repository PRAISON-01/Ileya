#Funtions
import math

def get_sub_total(item_price_list):
    sub_total = 0.0
    for price in item_price_list:

        sub_total += price

    return sub_total


def get_rate(rate):

    ratep = rate/100
    return ratep

def get_discount(item_price_list, rate):

    sub_total = get_sub_total(item_price_list)

    rate = get_rate(rate)

    discount = sub_total * rate
    return discount

def get_vat(item_price_list):

    sub_total = get_sub_total(item_price_list)
    vat = sub_total * 0.175
    vat = round(vat, 2)

    return vat

def get_bill_total(item_price_list, discount_rate):
    sub_total = get_sub_total(item_price_list)

    discount = get_discount(item_price_list, discount_rate)
    vat = get_vat(item_price_list)

    total_bill = sub_total - discount + vat
    return total_bill

def get_change(deposit, item_price_list, discount_rate):

    total_bill = get_bill_total(item_price_list, discount_rate)
    if total_bill > deposit:
        change = total_bill - deposit
    else:
        change = deposit - total_bill

    return change

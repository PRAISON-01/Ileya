
import math
from datetime import datetime

import check_out_function

time = datetime.now()
product_list = []
item_quantity_list = []
item_price_list = []

customer_name = input("Enter customer's Name => ")
count = 0

add_more = "yes"
while add_more.lower() == "yes":

    product_input = input("What did the customer buy => ")
    print()
    product_list.append(product_input)
    
    item_quantity_input = int(input("How many pieces => "))
    print()
    item_quantity_list.append(item_quantity_input)

    item_price_input = int(input("How much per unit => "))
    print()
    item_price_list.append(item_price_input)

    add_more = input("Add more items => ")
    print()
    count += 1

print()
cashier_name = input("What is your name => ")
print()
discount_rate = int(input("How much discount will he get => "))

total_item_prices = []

for index in range(count):
    total_item_prices.append(item_price_list[index] * item_quantity_list[index])

sub_total = check_out_function.get_sub_total(total_item_prices)
discount = check_out_function.get_discount(total_item_prices, discount_rate)
vat = check_out_function.get_vat(total_item_prices)
bill_total = check_out_function.get_bill_total(total_item_prices, discount_rate)

print("SEMICOLON STORES")
print()
print("MAIN BRANCH")
print()
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print()
print("TEL: 0911000010101")
print()
print(f"DATE: {time}")
print()
print(f"CASHIER: {cashier_name}")
print()
print(f"CUSTOMER NAME: {customer_name}")
print()
print("======================================================")

print("                ITEM    QTY     PRICE       TOTAL(NGN)")
print("------------------------------------------------------")


for index in range(0, count):
    print(f"{product_list[index]}{item_quantity_list[index]}{item_price_list[index]:.2f}{total_item_prices[index]:.2f}")

print("======================================================")

print()
print()
print("============================================================")
print()
print(f"                                     Sub Total => {sub_total:.2f}")
print(f"                                      Discount => {discount:.2f}")
print(f"                                  VAT @ 17.50% => {vat:.2f}")
print()
print("============================================================")
print()
print(f"                                    Bill Total => {bill_total:.2f}")
print()
print("============================================================")
print(f"THIS IS NOT A RECEIPT KINDLY PAY #{bill_total:.2f}")
print("============================================================")

deposit = float(input("How much did the customer give to you => "))

change = check_out_function.get_change(deposit, item_quantity_list, discount_rate)

print("SEMICOLON STORES")
print()
print("MAIN BRANCH")
print()
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print()
print("TEL: 0911000010101")
print()
print(f"DATE: {time}")
print()
print(f"CASHIER: {cashier_name}")
print()
print(f"CUSTOMER NAME: {customer_name}")
print()
print("======================================================")

print("                ITEM    QTY     PRICE       TOTAL(NGN)")
print("------------------------------------------------------")

for index in range(0, count):
    print(f"{product_list[index]}{item_quantity_list[index]}{item_price_list[index]:.2f}{total_item_prices[index]:.2f}")


print("======================================================")

print()
print()
print("============================================================")
print()
print(f"                                     Sub Total => {sub_total:.2f}")
print(f"                                      Discount => {discount:.2f}")
print(f"                                  VAT @ 17.50% => {vat:.2f}")
print()
print("============================================================")
print()
print(f"                                    Bill Total => {bill_total:.2f}")
print(f"                                    Amount paid => {deposit:.2f}")
print(f"                                    Balance => {change:.2f}")
print()
print("============================================================")
print("THANK YOU FOR YOUR PATRONAGE")
print("============================================================")











 

from checkoutfunctions import *
list_of_item_names = []
list_of_item_prices = []
list_of_item_quantity = []


customer_name = input("What is the customer's Name: ")

while True:
	item_name = input("What did customer buy? ")
	add_item_name_to_list_of_item_names(item_name, list_of_item_names)
	item_quantity = int(input("How many pieces? "))
	add_item_quantity_to_list_of_item_quantities(item_quantity, list_of_item_quantity)
	item_prices = int(input("How much per unit? "))
	add_item_prices_to_list_of_item_prices(item_prices, list_of_item_prices)
	loop_condition = input("Add more items? ")
	match(loop_condition):
		case "no":
			break
cashier_name = input("What is your name? ")
discount = int(input("How much discount will the customer get: "))

print_invoive(cashier_name, customer_name, list_of_item_names, list_of_item_prices, list_of_item_quantity, discount)


amount_paid = int(input("How much did the customer give to you? "))


print_receipt(cashier_name, customer_name, list_of_item_names, list_of_item_prices, list_of_item_quantity, discount, amount_paid)





			



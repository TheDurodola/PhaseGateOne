def add_item_name_to_list_of_item_names(name_of_item, list_of_item_names):
	list_of_item_names.append(name_of_item)
	return list_of_item_names


def add_item_prices_to_list_of_item_prices(item_price, list_of_item_prices):
	list_of_item_prices.append(item_price)
	return list_of_item_prices


def add_item_quantity_to_list_of_item_quantities(item_quantity, list_of_item_quantities):
	list_of_item_quantities.append(item_quantity)
	return list_of_item_quantities


def get_list_of_items_total(list_of_item_prices, list_of_item_quantities, list_of_item_total_prices):
	total = 0
	for index in range(len(list_of_item_prices)):
		total = list_of_item_prices[index] * list_of_item_quantities[index]
		list_of_item_total_prices.append(total)
	return list_of_item_total_prices


def get_sub_total(list_of_item_prices, list_of_item_quantities):
	total = 0
	for index in range(len(list_of_item_prices)):
		total = total + ( list_of_item_prices[index] * list_of_item_quantities[index])
	return total

def get_discount_amount(list_of_item_prices, list_of_item_quantities, discount):
	total = 0
	for index in range(len(list_of_item_prices)):
		total = total + ( list_of_item_prices[index] * list_of_item_quantities[index])
	discount_amount = total * (discount/100)
	return discount_amount


def get_VAT_amount(list_of_item_prices, list_of_item_quantities, discount):
	total = 0
	for index in range(len(list_of_item_prices)):
		total = total + ( list_of_item_prices[index] * list_of_item_quantities[index])
	discount_amount = total * (discount/100)
	amount = total - discount_amount
	vat_amount = amount * 0.075
	return vat_amount

def get_billed_amount(list_of_item_prices, list_of_item_quantities, discount):
	total = 0
	for index in range(len(list_of_item_prices)):
		total = total + ( list_of_item_prices[index] * list_of_item_quantities[index])
	discount_amount = total * (discount/100)
	amount = total - discount_amount
	vat_amount = amount * 0.075
	billed_amount = amount + vat_amount
	return billed_amount



def get_balance(list_of_item_prices, list_of_item_quantities, discount, amount_paid):
	total = 0
	for index in range(len(list_of_item_prices)):
		total = total + ( list_of_item_prices[index] * list_of_item_quantities[index])
	discount_amount = total * (discount/100)
	amount = total - discount_amount
	vat_amount = amount * 0.075
	billed_amount = amount + vat_amount
	balance = amount_paid - billed_amount
	return balance
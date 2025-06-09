import math

def get_list_of_single_digits(credit_card_number):
	list_of_single_digits = None
	
	length_of_digits = len(str(credit_card_number))
	if length_of_digits>=13 and length_of_digits<=16:
		list_of_single_digits = []

		if length_of_digits == 13:
			divisor = 1000000000000
			for index in range(13): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

		if length_of_digits == 14:
			divisor = 10000000000000
			for index in range(14): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

		if length_of_digits == 15:
			divisor = 100000000000000
			for index in range(15): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

		if length_of_digits == 16:
			divisor = 1000000000000000
			for index in range(16): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10
	
		return 	list_of_single_digits
			

def get_issuer(credit_card_number):
	list_of_single_digits = None
	
	length_of_digits = len(str(credit_card_number))
	if length_of_digits>=13 and length_of_digits<=16:
		list_of_single_digits = []

		if length_of_digits == 13:
			divisor = 1000000000000
			for index in range(13): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

		if length_of_digits == 14:
			divisor = 10000000000000
			for index in range(14): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

		if length_of_digits == 15:
			divisor = 100000000000000
			for index in range(15): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

		if length_of_digits == 16:
			divisor = 1000000000000000
			for index in range(16): 
				digit_picker = math.floor(credit_card_number/divisor)
				list_of_single_digits.append(digit_picker)
				credit_card_number = credit_card_number % divisor
				divisor = divisor / 10

	if list_of_single_digits[0] == 4:
		print("VISA")
	if list_of_single_digits[0] == 5:
		print("MASTERCARD")
	if list_of_single_digits[0] == 6:
		print("DISCOVER")
	if list_of_single_digits[0] == 3 and list_of_single_digits[1] == 7:
		print("AMERICAN EXPRESS")


def get_sum_of_odd_postioned_numbers(x):
	list_of_numbers = []
	list_picker = 0

	while list_picker < len(x):
		list_of_numbers.append(x[list_picker])
		list_picker += 2


			

	print(list_of_numbers)
  
	

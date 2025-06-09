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
		print("**Credit Card Type: VISA")
	if list_of_single_digits[0] == 5:
		print("**Credit Card Type: MASTERCARD")
	if list_of_single_digits[0] == 6:
		print("**Credit Card Type: DISCOVER")
	if list_of_single_digits[0] == 3 and list_of_single_digits[1] == 7:
		print("**Credit Card Type: AMERICAN EXPRESS")
	pass

def get_sum_of_odd_postioned_numbers(credit_card_number):
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

	list_of_numbers = []
	list_picker = 0

	while list_picker < len(list_of_single_digits ):
		list_of_numbers.append(list_of_single_digits[list_picker])
		list_picker += 2

	for index in range(len(list_of_numbers)):
		list_of_numbers[index] = list_of_numbers[index]*2
		if list_of_numbers[index] > 9:
			divisor = 10
			sum = 0;
			for counter in range(3):
				sum += math.floor(list_of_numbers[index]/divisor)
				list_of_numbers[index] = list_of_numbers[index]%divisor
				divisor = divisor/10	
			list_of_numbers[index] = sum
			

	sum_of_odd_positioned_numbers=0
	for index in range(len(list_of_numbers)):
		sum_of_odd_positioned_numbers += list_of_numbers[index]
	return sum_of_odd_positioned_numbers



def get_sum_of_even_postioned_numbers(credit_card_number):
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
	list_picker = 1
	sum = 0
	while list_picker < len(list_of_single_digits):
		sum = sum + list_of_single_digits[list_picker]
		list_picker += 2
	return sum

  
	

def get_validity(sum1, sum2):
	main_sum = sum1 + sum2
	return main_sum%10==0

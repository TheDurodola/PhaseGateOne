import math

def get_credit_card_brand(credit_card_number):
	length_of_digits = len(str(credit_card_number))
	if length_of_digits>=13 and length_of_digits <= 16:
		if length_of_digits == 13:
			if math.floor(credit_card_number/4000000000000) == 1:
					print("VISA")
			if math.floor(credit_card_number/5000000000000) == 1:
					print("MASTERCARD")
			if math.floor(credit_card_number/6000000000000) == 1:
					print("DISCOVER")
			if math.floor(credit_card_number/3700000000000) == 1:
					print("AMEX")

		if length_of_digits == 14:
			if math.floor(credit_card_number/40000000000000) == 1:
					print("VISA")
			if math.floor(credit_card_number/50000000000000) == 1:
					print("MASTERCARD")
			if math.floor(credit_card_number/60000000000000) == 1:
					print("DISCOVER")
			if math.floor(credit_card_number/37000000000000) == 1:
					print("AMEX")

		if length_of_digits == 15:
			if math.floor(credit_card_number/400000000000000) == 1:
					print("VISA")
			if math.floor(credit_card_number/500000000000000) == 1:
					print("MASTERCARD")
			if math.floor(credit_card_number/600000000000000) == 1:
					print("DISCOVER")
			if math.floor(credit_card_number/370000000000000) == 1:
					print("AMEX")

		if length_of_digits == 16:
			if math.floor(credit_card_number/4000000000000000) == 1:
					print("VISA")
			if math.floor(credit_card_number/5000000000000000) == 1:
					print("MASTERCARD")
			if math.floor(credit_card_number/6000000000000000) == 1:
					print("DISCOVER")
			if math.floor(credit_card_number/3700000000000000) == 1:
					print("AMEX")

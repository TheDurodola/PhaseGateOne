import credit_card_validator_functions

credit_card_number = int(input("Enter your Card Numbers: "))
try:
	sum1 = credit_card_validator_functions.get_sum_of_odd_postioned_numbers(credit_card_number)
	sum2 = credit_card_validator_functions.get_sum_of_even_postioned_numbers(credit_card_number)

	credit_card_validator_functions.get_issuer(credit_card_number)
	print("**Credit Card Number:",credit_card_number)
	print("**Credit Card Digit Length:", len(str(credit_card_number)))
	print("**Credit Card Valid:",credit_card_validator_functions.get_validity(sum1, sum2))

except TypeError:

	print("INVALID DIGIT LENGTH!")

import creditcardvalidatorfunctions

credit_card_number = int(input("Enter your Card Numbers: "))
try:
	sum1 = creditcardvalidatorfunctions.get_sum_of_odd_postioned_numbers(credit_card_number)
	sum2 = creditcardvalidatorfunctions.get_sum_of_even_postioned_numbers(credit_card_number)

	creditcardvalidatorfunctions.get_issuer(credit_card_number)
	print("**Credit Card Number:",credit_card_number)
	print("**Credit Card Digit Length:", len(str(credit_card_number)))
	print("**Credit Card Valid:",creditcardvalidatorfunctions.get_validity(sum1, sum2))

except TypeError:

	print("INVALID DIGIT LENGTH!")

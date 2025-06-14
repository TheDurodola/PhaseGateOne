from unittest import TestCase
import credit_card_validator_functions


class TestCardCardValidator(TestCase):
	def test_that_get_turn_input_into_a_list_of_single_digits_works(self):
		actual =  credit_card_validator_functions.get_list_of_single_digits(5388576018402)
		expected = [5,3,8,8,5,7,6,0,1,8,4,0,2]
		self.assertEqual(actual, expected)

		actual =  credit_card_validator_functions.get_list_of_single_digits(43885760184024)
		expected = [4,3,8,8,5,7,6,0,1,8,4,0,2,4]
		self.assertEqual(actual, expected)


		actual =  credit_card_validator_functions.get_list_of_single_digits(638857601840247)
		expected = [6,3,8,8,5,7,6,0,1,8,4,0,2,4,7]
		self.assertEqual(actual, expected)
	
	
		actual =  credit_card_validator_functions.get_list_of_single_digits(3788576018402478)
		expected = [3,7,8,8,5,7,6,0,1,8,4,0,2,4,7,8]
		self.assertEqual(actual, expected)
	
	def test_that_get_turn_input_into_a_list_of_single_digits_rejects_card_numbers_that_are_not_within_the_13_to_16_range(self):
		actual =  credit_card_validator_functions.get_list_of_single_digits(378857601840)
		expected = None
		self.assertEqual(actual, expected)

		actual =  credit_card_validator_functions.get_list_of_single_digits(378857601840000000)
		expected = None
		self.assertEqual(actual, expected)


	def test_that_get_credit_card_issuer(self):
		credit_card_validator_functions.get_issuer(43885760184024)
		credit_card_validator_functions.get_issuer(5388576018402)
		credit_card_validator_functions.get_issuer(638857601840247)
		credit_card_validator_functions.get_issuer(3788576018402478)


	def test_that_get_sum_of_numbers_multiplied_by_two_at_odd_positions(self):
		actual = credit_card_validator_functions.get_sum_of_odd_postioned_numbers(3788576018402478)
		expected = 36
		self.assertEqual(actual, expected)


	def test_that_get_sum_of_numbers_even_positions(self):
		actual = credit_card_validator_functions.get_sum_of_even_postioned_numbers(3788576018402478)
		expected = 42
		self.assertEqual(actual, expected)


	def test_that_validity_of_card_number(self):
		actual = credit_card_validator_functions.get_validity(36,42)
		expected = False
		self.assertEqual(actual, expected)






		
		

		
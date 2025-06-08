from unittest import TestCase
import credit_card_validator_functions


class TestCardCardValidator(TestCase):
	def test_that_get(self):
		actual =  credit_card_validator_functions.get_credit_card_brand(4388576018402)
		#expected = "VISA"
		#self.assertEqual(actual, expected)


from unittest import TestCase
import menstrual_app
from datetime import date, timedelta


class TestMenstrualApp(TestCase):
	

	def test_that_amount_deposit_reflects_on_the_balance(self):
		actual = deposit_amount(0,6000)
		expected = 6000
		self.assertEqual(actual, expected)

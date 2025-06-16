import atmachinefunctions
from unittest import TestCase


class TestATMachineApp(TestCase):
	def test_create_account_exist(self):
		bank_database = []
		actual = atmachinefunctions.create_account(bank_database, "Bolaji", "Durodola", "1234")	
		expected = [["Bolaji", "Durodola", "1234",0]]
		self.assertEqual(actual, expected)
	


	def test_deposit_amount(self):

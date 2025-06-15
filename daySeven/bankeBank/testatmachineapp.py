import atmachinefunctions
from unittest import TestCase


class TestATMachineApp(TestCase):
	def test_create_account_exist(self):
		bank_database = []
		atmachinefunctions.create_account(bank_database, "Bolaji", "Durodola", "1234")	
	

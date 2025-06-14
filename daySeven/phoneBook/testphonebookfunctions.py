from unittest import TestCase
from phonebookfunctions import *

class TestPhoneBook(TestCase):
	def test_that_add_to_phone_book_works(self):
		phonebook_database = []
		actual = add_contact_to_phonebook(phonebook_database, "bolaji", "durodola", 814826070)
		expected = [["bolaji", "durodola", 814826070]]
		self.assertEqual(actual, expected)

	def test_that_add_to_phone_book_rejects_(self):
		phonebook_database = []
		actual = add_contact_to_phonebook(phonebook_database, "b", "durodola", 814826070)
		expected = None
		self.assertEqual(actual, expected)

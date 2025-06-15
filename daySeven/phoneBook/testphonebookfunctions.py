from unittest import TestCase
from phonebookfunctions import *

class TestPhoneBook(TestCase):
	def test_that_add_to_phone_book_works(self):
		phonebook_database = []
		actual = add_contact_to_phonebook(phonebook_database, "bolaji", "durodola", "08082224444")
		expected = [["bolaji", "durodola", 814826070]]
		self.assertEqual(actual, expected)

	def test_that_add_to_phone_book_rejects_invalid_name_input(self):
		phonebook_database = []
		actual = add_contact_to_phonebook(phonebook_database, "", "", "08082224444")
		expected = None
		self.assertEqual(actual, expected)


	def test_that_add_to_phone_book_rejects_invalid_phone_number_input(self):
		phonebook_database = []
		actual = add_contact_to_phonebook(phonebook_database, "Serial", "Killer", 0)
		expected = None
		self.assertEqual(actual, expected)

	def test_that_remove_contact_works(self):
		phonebook_database =  [["bolaji", "durodola", "08082224444"],["Unilag", "Baddie", "08082223333"]]
		actual = remove_contact(phonebook_database, 2)
		expected =  [["bolaji", "durodola", "08082224444"]]
		self.assertEqual(actual, expected)


	def test_find_contact_via_phone_number(self):
		phonebook_database =  [["bolaji", "durodola", "08082224444"],["Unilag", "Baddie", "08082223333"]]
		actual = find_by_phone_number(phonebook_database, "08082223333")
		expected = ["Unilag", "Baddie", "08082223333"]
		self.assertEqual(actual, expected)

	def test_find_contact_via_phone_number_returns_none_if_number_doesnt_exist(self):
		phonebook_database =  [["bolaji", "durodola", "08082224444"],["Unilag", "Baddie", "08082223333"]]
		actual = find_by_phone_number(phonebook_database, 90909090)
		expected = None
		self.assertEqual(actual, expected)


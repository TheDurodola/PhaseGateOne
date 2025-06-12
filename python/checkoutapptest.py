from unittest import TestCase
import checkoutfunctions

class TestCheckOutApp(TestCase):
	def test_that_add_item_name_to_list_of_item_names_works(self):
		list = []
		actual =  checkoutfunctions.add_item_name_to_list_of_item_names("mango", list)
		expected = ["mango"]
		self.assertEqual(actual, expected)

	def test_that_add_item_prices_to_list_of_item_prices_works(self):
		list = []
		actual =  checkoutfunctions.add_item_prices_to_list_of_item_prices(1200, list)
		expected = [1200]
		self.assertEqual(actual, expected)

	def test_that_add_item_quantity_to_list_of_item_quantities_works(self):
		list = [1]
		actual =  checkoutfunctions.add_item_quantity_to_list_of_item_quantities(2, list)
		expected = [1, 2]
		self.assertEqual(actual, expected)


	def test_that_get_list_of_items_total_works(self):
		list_of_prices = [1000, 500, 3000]
		list_of_quantity = [2, 3, 3]
		list_of_total = []
		actual =  checkoutfunctions.get_list_of_items_total(list_of_prices, list_of_quantity, list_of_total)
		expected = [2000,1500, 9000]
		self.assertEqual(actual, expected)


	def test_that_get_sub_total_work(self):
		list_of_prices = [1000, 500, 3000]
		list_of_quantity = [2, 3, 3]
		actual =  checkoutfunctions.get_sub_total(list_of_prices, list_of_quantity)
		expected = 12500
		self.assertEqual(actual, expected)

	def test_get_discount_amount_works(self):
		list_of_prices = [1000, 500, 3000]
		list_of_quantity = [2, 3, 3]
		discount = 8
		actual = checkoutfunctions.get_discount_amount(list_of_prices, list_of_quantity, discount)
		expected = 1000
		self.assertEqual(actual, expected)

	def test_that_get_VAT_amount_works(self):
		list_of_prices = [1000, 500, 3000]
		list_of_quantity = [2, 3, 3]
		discount = 8
		actual = checkoutfunctions.get_VAT_amount(list_of_prices, list_of_quantity, discount)
		expected = 862.5
		self.assertEqual(actual, expected)

	def test_that_get_billed_amount_works(self):
		list_of_prices = [1000, 500, 3000]
		list_of_quantity = [2, 3, 3]
		discount = 8
		actual = checkoutfunctions.get_billed_amount(list_of_prices, list_of_quantity, discount)
		expected = 12362.5
		self.assertEqual(actual, expected)


	def test_that_get_balance_works(self):
		list_of_prices = [1000, 500, 3000]
		list_of_quantity = [2, 3, 3]
		discount = 8
		amount_paid = 13000
		actual = checkoutfunctions.get_balance(list_of_prices, list_of_quantity, discount, amount_paid)
		expected = 637.5
		self.assertEqual(actual, expected)

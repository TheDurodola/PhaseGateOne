from unittest import TestCase
import menstrual_app_functions
import datetime


class TestBankApp(TestCase):

	def test_that_get_date_of_end_cycle_works(self):
		actual = menstrual_app_functions.get_date_of_current_menstrual_cycle_end_date(2025, 8, 3, 26);
		expected = datetime.date(2025, 8, 28)
		self.assertEqual(actual,expected)

	def test_that_get_date_of_end_cycle_rejects_negative_figures(self):
		actual = menstrual_app_functions.get_date_of_current_menstrual_cycle_end_date(2025, 8, 3, -26);
		expected = None
		self.assertEqual(actual,expected)
	
	def test_that_get_end_of_flow_days_works(self):
		actual = menstrual_app_functions.get_date_of_end_of_flow_day(2025, 8, 3, 7);
		expected = datetime.date(2025, 8, 10)
		self.assertEqual(actual, expected)

	def test_that_get_end_of_flow_days_rejects_negative_duration_of_flow_days(self):
		actual = menstrual_app_functions.get_date_of_end_of_flow_day(2025, 8, 3, -7);
		expected = None
		self.assertEqual(actual, expected)

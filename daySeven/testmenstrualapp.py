from unittest import TestCase
import menstrualappfunctions
import datetime


class TestBankApp(TestCase):

	def test_that_get_date_of_end_cycle_works(self):
		actual = menstrualappfunctions.get_date_of_current_menstrual_cycle_end_date(datetime.date(2025, 8, 3), 26);
		expected = datetime.date(2025, 8, 28)
		self.assertEqual(actual,expected)

	def test_that_get_date_of_end_cycle_rejects_negative_figures(self):
		actual = menstrualappfunctions.get_date_of_current_menstrual_cycle_end_date(datetime.date(2025, 8, 3), -26);
		expected = None
		self.assertEqual(actual,expected)
	
	def test_that_get_end_of_flow_days_works(self):
		actual = menstrualappfunctions.get_date_of_end_of_flow_day(datetime.date(2025, 8, 3), 7);
		expected = datetime.date(2025, 8, 10)
		self.assertEqual(actual, expected)

	def test_that_get_end_of_flow_days_rejects_negative_duration_of_flow_days(self):
		actual = menstrualappfunctions.get_date_of_end_of_flow_day(datetime.date(2025, 8, 3), -7);
		expected = None
		self.assertEqual(actual, expected)

	def test_that_get_start_of_fertile_window_works(self):
		actual = menstrualappfunctions.get_start_date_of_ovulation(datetime.date(2025, 8, 28));
		expected = datetime.date(2025, 8, 12)
		self.assertEqual(actual, expected)		

	def test_that_get_end_of_fertile_window_works(self):
		actual = menstrualappfunctions.get_end_date_of_ovulation(datetime.date(2025, 8, 28));
		expected = datetime.date(2025, 8, 16)
		self.assertEqual(actual, expected)

	def test_that_safe_day_after_ovulation(self):
		actual = menstrualappfunctions.get_safe_day_start_after_ovulation(datetime.date(2025, 8, 28));
		expected = datetime.date(2025, 8, 29)
		self.assertEqual(actual, expected)



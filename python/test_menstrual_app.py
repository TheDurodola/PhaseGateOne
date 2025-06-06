from unittest import TestCase
import menstrual_app
from datetime import date, timedelta


class TestMenstrualApp(TestCase):
	

	def test_that_get_date_of_current_menstrual_cycle_end_date_works(self):
		actual = menstrual_app.get_date_of_current_menstrual_cycle_end_date(2025, 8 , 3, 26)
		expected = date(2025, 8 , 28)
		self.assertEqual(actual, expected)

	def test_that_get_end_day_period_flow(self):
		actual = menstrual_app.get_date_of_flow_day_end(2025, 8 , 3, 7)
		expected = date(2025, 8 , 10)
		self.assertEqual(actual, expected)


	def test_that_get_date_of_flow_day_end(self):
		actual = menstrual_app.get_start_day_fertile(2025, 8 , 3, 26)
		expected = date(2025, 8 , 12)
		self.assertEqual(actual, expected)

	def test_that_get_end_day_fertile_works(self):
		actual = menstrual_app.get_end_day_fertile(2025, 8 , 3, 26)
		expected = date(2025, 8 , 16)
		self.assertEqual(actual, expected)


	def test_that_get_safe_day_after_ovulation(self):
		actual = menstrual_app.get_safe_day_after_ovulation(2025,8,3,26)
		expected = date(2025, 8 , 17)
		self.assertEqual(actual, expected)

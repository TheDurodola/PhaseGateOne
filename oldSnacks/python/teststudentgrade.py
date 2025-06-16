from studentgradefunctions import *
from unittest import TestCase


class TestStudentGrade(TestCase):
	def test_modify_school_database_works(self):
		actual = modify_school_database([], 2, 3)	
		expected = [[0,0],[0,0],[0,0]]
		self.assertEqual(actual, expected)


	def test_modify_school_database_rejects_negative_input(self):
		actual = modify_school_database([], -2, -3)	
		expected = []
		self.assertEqual(actual, expected)

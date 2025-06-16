from studentgradefunctions import *

school_database = []

student_size = int(input("How many students do you have: "))
subject_size = int(input("How many subjects do you have: "))

modify_school_database(school_database, subject_size, student_size)



for index in range(len(school_database)):
	for count in range(subject_size):
		print(f"Entering score for student {index+1}")
		print(f"Enter score for subject {count+1}")
		school_database[index][count] = int(input(""))
		print(school_database)



print(school_database)



class_size = int(input("How many students do you have: "))
curriculum = int(input("How many subjects do you have: "))



"""if subject_size > 0 and student_size > 0:
		temp_subject_list = []
		for index in range(subject_size):
			temp_subject_list.append(0) 

		for index in range(student_size):
			list.append(temp_subject_list)

	list = [[0]*subject_size]* student_size"""

school_database = [[0 for subject in range(curriculum)] for student in range(class_size)]



for index in range(len(school_database)):
	for count in range(curriculum):
		while(True):
			print(f"Entering score for student {index+1}")
			print(f"Enter score for subject {count+1}")
			score = int(input(""))
			if score >=1 and score<=100:
				school_database[index][count] = score
				break
			else:
				print("\n<<SCORE MUST BE BETWEEN 1-100>>")
		
list_of_totals = []

for students in range(class_size):
	total = 0
	for subject in range(curriculum):
		total = total + school_database[students][subject]
	list_of_totals.append(total)
	


print("=========================================================================================")
print("STUDENT		", end="")
for index in range(curriculum):
	print(f"SUB{index+1}	", end="")
print("TOT	AVE	POS")

print("=========================================================================================")

for index in range(class_size):
	print(f"STUDENT{index+1}	", end="")
	for count in range(curriculum):
		print(f"{school_database[index][count]}	", end="")
	print(f"{list_of_totals[index]}	{list_of_totals[index]/curriculum}")

print("=========================================================================================")





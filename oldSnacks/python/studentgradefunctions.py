def modify_school_database(list, subject_size, student_size):
	"""if subject_size > 0 and student_size > 0:
		temp_subject_list = []
		for index in range(subject_size):
			temp_subject_list.append(0) 

		for index in range(student_size):
			list.append(temp_subject_list)"""

	list = [[0]*subject_size]* student_size
	return list
	


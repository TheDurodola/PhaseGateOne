def add_contact_to_phonebook(list, first_name, last_name, phone_number):

	for index in range(len(list)):
		if first_name == list[index][0] and last_name == list[index][1]:
			print("\nFAILED. Contact Name Already Exist!")
			return list	
	
	for index in range(len(list)):
		if phone_number == list[index][2]:
			print("\nFAILED. Number Already Exist!")
			return list	

	if len(first_name) > 0:
		if len(last_name) > 0: 
			if len(phone_number)==11:
				new_contact = []
				new_contact.append(first_name)
				new_contact.append(last_name)
				new_contact.append(phone_number)
				list.append(new_contact)
				print("Contact Added.")
				return list
			else:
				print("INVALID NUMBER")
		else:
			print("INVALID LAST NAME")
	else:
		print("INVALID FIRST NAME");


def remove_contact(list, contact_to_be_removed):
	list.pop(contact_to_be_removed-1)
	print("Contact Removed.")
	return list


def find_by_phone_number(list, wanted_number):
	for phone_number in range(len(list)):
		if wanted_number == list[phone_number][2]:
			print("\nFirst Name:",list[phone_number][0])
			print("Last Name:",list[phone_number][1])
			print("Phone Number:",list[phone_number][2])
			exit = input("Enter any key to exit: ")
			return
	print("CONTACT DOESN'T EXIST")


def find_by_first_name(list, wanted):
	for name in range(len(list)):
		if wanted == list[name][0]:
			print("\nFirst Name:", list[name][0])
			print("Last Name:", list[name][1])
			print("Phone Number:", list[name][2])
			exit = input("Enter any key to exit: ")
			return
	print("CONTACT DOESN'T EXIST")



def find_by_last_name(list, wanted):
	for name in range(len(list)):
		if wanted == list[name][1]:
			print("\nFirst Name:", list[name][0])
			print("Last Name:", list[name][1])
			print("Phone Number:", list[name][2])
			exit = input("Enter any key to exit: ")
			return
	print("CONTACT DOESN'T EXIST")



def edit_first_name(new_first_name, database, list_index):	
	database[list_index][0] = new_first_name
	return database

def edit_last_name(new_last_name, database, list_index):
	database[list_index][1] = new_last_name
	return database

def edit_phone_number(new_phone_number, database, list_index):
	for index in range(len(database)):
		if new_phone_number == database[index][2]:
			print("\nFAILED. Number Already Exist!")
			return database	

	database[list_index][2] = new_phone_number
	return database
	
		
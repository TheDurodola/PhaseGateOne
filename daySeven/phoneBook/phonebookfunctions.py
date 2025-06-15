def add_contact_to_phonebook(list, first_name, last_name, phone_number):
	for index in range(len(list)):
		if phone_number == list[index][2]:
			print("Number already Exist")
			return list	

	if len(first_name) > 0:
		if len(last_name) > 0: 
			if len(phone_number)==11:
				new_contact = []
				new_contact.append(first_name)
				new_contact.append(last_name)
				new_contact.append(phone_number)
				list.append(new_contact)
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
			return list[phone_number]
	print("CONTACT DOESN'T EXIST")


def find_by_first_name(list, wanted):
	for name in range(len(list)):
		if wanted == list[name][0]:
			return list[name]
	print("CONTACT DOESN'T EXIST")



def find_by_last_name(list, wanted):
	for name in range(len(list)):
		if wanted == list[name][1]:
			return list[name]
	print("CONTACT DOESN'T EXIST")



def edit_contact(new_first_name, new_last_name, new_phone_number):
	pass
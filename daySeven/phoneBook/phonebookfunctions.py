def add_contact_to_phonebook(list, first_name, last_name, phone_number):
	if len(first_name) > 1 and len(last_name) > 1:
		if (phone_number > 801000000 and phone_number <8199999999) or (phone_number > 901000000 and phone_number <9199999999):
			new_contact = []
			new_contact.append(first_name)
			new_contact.append(last_name)
			new_contact.append(phone_number)
			list.append(new_contact)
			return list
		else:
			print("INVALID NUMBER")
	else:
		print("INVALID NAME INPUT");
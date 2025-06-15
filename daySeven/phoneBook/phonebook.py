from phonebookfunctions import *


phonebook_database = []
while True:
	main_menu_display = """
		WELCOME TO YRSD PHONEBOOK

1) Add Contact
2) Remove Contact
3) Find Contact
4) Edit Contact

0) Exit"""

	print(main_menu_display)
	main_menu_navigator = int(input("What would you like to do: "))



	match(main_menu_navigator):
			case 1:
				first_name = input("Enter First Name: ")
				last_name = input("Enter Last Name: ")
				phone_number = input("Enter Phone Number: ")
				add_contact_to_phonebook(phonebook_database, first_name, last_name, phone_number)			
			case 2:
				for index, record in enumerate(phonebook_database):
					print(index+1, record[0])
				remove_input = int(input("What contact would you like to delete: "))
				try:
					remove_contact(phonebook_database, remove_input)
				except IndexError:
					print("\n<<INVALID INPUT>>")
			case 3:
				while True:
					print("\n1) Find by First Name\n2) Find by Last Name\n3) Find by Phone Number\n\n0) Back")
					navigator = int(input("What would you like to do: "))
					match(navigator):
						case 1:
							first_name = input("Enter the first name: ")
							find_by_first_name(phonebook_database, first_name)
						case 2:
							last_name = input("Enter the last name: ")
							find_by_last_name(phonebook_database, last_name)
						case 3:
							phone_number = input("Enter phone number: ")
							find_by_phone_number(phonebook_database, phone_number)
						case 0:
							break
						case _:
							print("\n<<INVALID OPTION>>")

			case 4:
				for index, record in enumerate(phonebook_database):
					print(index+1, record[0])
				chosen_contact = int(input("Pick the Contact: "))
				print("\n1) First Name\n2) Last Name\n3) Phone Number")
				option = int(input("Enter your choose: "))
				match(option):
					case 1:
						first_name = input("Enter the new First Name: ")
						edit_first_name(first_name, phonebook_database, chosen_contact-1)

					case 2:
						last_name = input("Enter the new Last Name: ")
						edit_last_name(last_name, phonebook_database, chosen_contact-1)

					case 3:
						phone_number = input("Enter the new Phone Number: ")
						edit_phone_number(phone_number, phonebook_database, chosen_contact-1)

					case _:
						print("INVALID OPTIONS")
			case 0:
				print("\nGood bye.")
				break
			case _:
				print("\n<<INVALID OPTION>>")
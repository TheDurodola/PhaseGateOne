def create_account(bank_database, first_name, last_name, pin):
	#account_number = random.randint(1000000000, 9999999999)
	account_details = [first_name, last_name, pin, 0]
	bank_database.append(account_details)
	return bank_database
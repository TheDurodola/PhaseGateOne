def create_account(bank_database, first_name, last_name, pin):
	bank_database.append(first_name)
	bank_database.append(last_name)
	bank_database.append(pin)
	bank_database.append(0)

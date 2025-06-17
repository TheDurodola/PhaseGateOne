for index in range(1,11):
	if index%4==0:
		multiple = index
		for count in range(5):
			print(f"{multiple} ", end="")
			multiple = multiple * index
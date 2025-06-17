for index in range(1,11):
	sum = 0
	if index%4==0:
		multiple = index
		for count in range(5):
			multiple = multiple * index
		sum = sum + multiple
	print(sum)
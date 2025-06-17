for index in range(1,11):
	sum = 0
	if index%4==0:
		multiple = index
		for count in range(5):
			sum = sum + multiple
			multiple = multiple * index

	print(sum)
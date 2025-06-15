import datetime
import sys
from menstrualappfunctions import *

now = datetime.datetime.now()

print("WELCOME TO YRSD BOO TING")
print("Kindly enter your details below;\n")
try:
	yyyy = now.year
	mm = int(input("Enter the month your cycle started(Jan=>1): "))
	dd = int(input("Enter the day your cycle started(1-31): "))
	cycle_duration = int(input("\nEnter your average cycle length (21-35 days): "))
	flow_duration = int(input("Enter your average flow length (2-10 days): "))
except ValueError:
	sys.exit("INVALID INPUT")



date_that_cycle_started = datetime.date(yyyy, mm, dd)
try:
	current_menstrual_end_date = get_date_of_current_menstrual_cycle_end_date(date_that_cycle_started, cycle_duration)
	date_of_ovulation_end = get_end_date_of_ovulation(current_menstrual_end_date)
except TypeError:
	print("\nINVALID INPUT")
	sys.exit("Sorry, boo. :(")

loop_condition = 0
while(loop_condition!=1):
	main_menu_display = """\n\t\tWhat would you like to know?\n
1) End date for Current Cycle
2) End date for Period Flow
3) Ovulation Window
4) Safe Days
0) Exit"""

	print(main_menu_display)

	main_menu_navigator = int(input("Enter your move (1-4): "))

	match(main_menu_navigator):
		case 1:
			print("\nYour current cycle will end on the" , current_menstrual_end_date)
		case 2:
			print("\nYour flow day is predicated to end on the" , get_date_of_end_of_flow_day(date_that_cycle_started, flow_duration))
		case 3:
			print("\nYour ovulation start date is predicated to be", get_start_date_of_ovulation(current_menstrual_end_date),"to", get_end_date_of_ovulation(current_menstrual_end_date))
		case 4:
			print("\nSafe Period before Ovulation:", date_that_cycle_started, "to", get_date_of_end_of_flow_day(date_that_cycle_started, flow_duration))
			print("Safe Period after Ovulation:", get_safe_day_start_after_ovulation(date_of_ovulation_end), "to",current_menstrual_end_date)
		case 0:
			print("\nGood bye, boo.")
			loop_condition = 1

		case _:
			print("INVALID OPOTION")
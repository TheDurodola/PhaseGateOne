import datetime
from menstrual_app_functions import get_date_of_current_menstrual_cycle_end_date, get_date_of_end_of_flow_day, get_start_date_of_ovulation, get_end_date_of_ovulation, get_safe_day_start_after_ovulation

print("WELCOME TO YRSD BOO TING")

yyyy = int(input("Enter the year(20XX): "))
mm = int(input("Enter the month your cycle started(Jan=>1): "))
dd = int(input("Enter the day your cycle started(1-31): "))
cycle_duration = int(input("Enter your average cycle length (21-35 days): "))
flow_duration = int(input("Enter your average flow length (2-10 days): "))

date_that_cycle_started = datetime.date(yyyy, mm, dd)

current_menstrual_end_date = get_date_of_current_menstrual_cycle_end_date(date_that_cycle_started, cycle_duration)
date_of_ovulation_end = get_end_date_of_ovulation(current_menstrual_end_date)

print("Your current cycle will end on the" , current_menstrual_end_date)
print("Your flow day is predicated to end on the" , get_date_of_end_of_flow_day(date_that_cycle_started, flow_duration))
print("Your ovulation start date is predicated to be", get_start_date_of_ovulation(current_menstrual_end_date),"to", get_end_date_of_ovulation(current_menstrual_end_date))
print("Safe Period before Ovulation:", date_that_cycle_started, "to", get_date_of_end_of_flow_day(date_that_cycle_started, flow_duration))
print("Safe Period after Ovulation:", get_safe_day_start_after_ovulation(date_of_ovulation_end), "to",current_menstrual_end_date)
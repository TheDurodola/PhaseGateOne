from datetime import date, timedelta


def get_date_of_current_menstrual_cycle_end_date(date_that_cycle_started,duration_of_cycle):
	if duration_of_cycle>0:
		current_cycle_end = date_that_cycle_started + timedelta(days=duration_of_cycle-1)
		return current_cycle_end 

def get_date_of_end_of_flow_day(date_that_cycle_started,duration_of_flow):
	if duration_of_flow>0:
		current_flow_end = date_that_cycle_started + timedelta(days=duration_of_flow)
		return current_flow_end 


def get_start_date_of_ovulation(current_cycle_end):
	date_of_ovulation_start = current_cycle_end - timedelta(16)
	return date_of_ovulation_start

def get_end_date_of_ovulation(current_cycle_end):
	date_of_ovulation_end = current_cycle_end - timedelta(12)
	return date_of_ovulation_end
	

def get_safe_day_start_after_ovulation(date_of_ovulation_end):
	date_of_safe_date_after_ovulation = date_of_ovulation_end +timedelta(1)
	return date_of_safe_date_after_ovulation

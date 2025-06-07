from datetime import date, timedelta

def get_date_of_current_menstrual_cycle_end_date(yyyy,mm,dd,duration_of_cycle):
	if duration_of_cycle>0:
		current_cycle_start_date = date(yyyy, mm, dd)
		current_cycle_end = current_cycle_start_date + timedelta(days=duration_of_cycle-1)
		return current_cycle_end 

def get_date_of_end_of_flow_day(yyyy,mm,dd,duration_of_flow):
	if duration_of_flow>0:
		current_cycle_start_date = date(yyyy, mm, dd)
		current_flow_end = current_cycle_start_date + timedelta(days=duration_of_flow)
		return current_flow_end 



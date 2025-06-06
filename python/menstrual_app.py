from datetime import date, timedelta
	
def get_date_of_current_menstrual_cycle_end_date(yyyy,mm,dd,duration_of_cycle):
	if yyyy >2024 and mm>0 and mm<13 and dd>0 and dd<32:
		current_cycle_start_date = date(yyyy, mm, dd)
		current_cycle_end = current_cycle_start_date + timedelta(days=duration_of_cycle-1)
		return current_cycle_end 

def get_date_of_flow_day_end(yyyy,mm,dd, flow_days):
	current_cycle_start_date = date(yyyy, mm, dd)
	current_flow_end = current_cycle_start_date + timedelta(days=flow_days)
	return current_flow_end 

def get_start_day_fertile(yyyy, mm, dd, duration_of_cycle):
	current_cycle_start_date = date(yyyy, mm, dd)
	current_cycle_end = current_cycle_start_date + timedelta(days=duration_of_cycle-1)
	fertile_day_middle = current_cycle_end - timedelta(days=14)
	start_day = fertile_day_middle- timedelta(days=2)
	return start_day


def get_end_day_fertile(yyyy,mm,dd,duration_of_cycle):

	current_cycle_start_date = date(yyyy, mm, dd)
	current_cycle_end = current_cycle_start_date + timedelta(days=duration_of_cycle-1)
	fertile_day_middle = current_cycle_end - timedelta(days=14)
	end_day = fertile_day_middle + timedelta(days=2)
	return end_day


def get_safe_day_after_ovulation(yyyy,mm,dd,duration_of_cycle):
	current_cycle_start_date = date(yyyy, mm, dd)
	current_cycle_end = current_cycle_start_date + timedelta(days=duration_of_cycle-1)
	fertile_day_middle = current_cycle_end - timedelta(days=14)
	end_day = fertile_day_middle + timedelta(days=2)
	safe_day = end_day + timedelta(days=1)
	return safe_day


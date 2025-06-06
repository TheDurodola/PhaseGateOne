from datetime import date, timedelta

"""duration_of_cycle = 26
yyyy = 2025
mm = 8
dd = 3
"""

	def get_date_of_current_menstrual_cycle_end_date(yyyy,mm,dd,duration):
		current_cycle_start_date = date(yyyy, mm, dd)
		current_cycle_end = current_cycle_start_date + timedelta(days=duration_of_cycle-1)
		return current_cycle_end 

	def get_date_of_flow_day_end():
		current_cycle_start_date = date(2025, 8, 3)
		current_flow_end = current_cycle_start_date + timedelta(days=7)
		return current_flow_end 

	
	def get_date_of_predicted_fertile_day_middle():
		current_cycle_end = date(2025, 8, 28)
		fertile_day_middle = current_cycle_end - timedelta(days=14)
		return fertile_day_middle

	def get_start_day_fertile():
		fertile_day_middle = date(2025, 8, 14)
		start_day = fertile_day_middle- timedelta(days=2)
		return start_day


	def get_end_day_fertile():
		fertile_day_middle = date(2025, 8, 14)
		end_day = fertile_day_middle + timedelta(days=2)
		return end_day


	def get_safe_day_after_ovulation():
		current_cycle_start_end = date(2025, 8, 14)
		safe_day = current_cycle_start_end + timedelta(days=3)

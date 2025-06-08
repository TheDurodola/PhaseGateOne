import java.time.LocalDate;


public class MenstrualAppFunctions{


public static LocalDate getDateOfEndOfMenstrualCycle(LocalDate dateOfStartOfMenstrualCycle, int cycleDurationLength){
	LocalDate dateOfEndOfMenstrualCycle = null;
	if(cycleDurationLength>=21 && cycleDurationLength<=35){
		dateOfEndOfMenstrualCycle = dateOfStartOfMenstrualCycle.plusDays(cycleDurationLength-1);
	}
	if(cycleDurationLength<21 && cycleDurationLength<35 && cycleDurationLength>0 ){
		System.out.println("Your period is out of the usual range. It is advisable for you to seek Medical Assistance.");	
	}
	
	if(cycleDurationLength<=0 ){
		System.out.println("INVALID FIGURE!");	
	}
return dateOfEndOfMenstrualCycle;
}


public static LocalDate getEndOfFlowDays(LocalDate dateOfStartOfMenstrualCycle, int flowDaysDuration){
	LocalDate dateOfFlowDaysEnd = null;	
	if(flowDaysDuration>=2 && flowDaysDuration<=8){
		dateOfFlowDaysEnd = dateOfStartOfMenstrualCycle.plusDays(flowDaysDuration);
	}
	if(flowDaysDuration==1 || flowDaysDuration>8){
		System.out.println("It is advised that you seek Medical Assistance as flow days are out of the usual range");
		dateOfFlowDaysEnd = dateOfStartOfMenstrualCycle.plusDays(flowDaysDuration);
	}
	if(flowDaysDuration<=0){
		System.out.println("INVALID FIGURE!");	
	}
return dateOfFlowDaysEnd;
}


public static LocalDate getFertileWindowStartDate(LocalDate dateOfEndOfMenstrualCycle){
	LocalDate dateOfFertileWindowStart = dateOfEndOfMenstrualCycle.minusDays(16);
	return dateOfFertileWindowStart;
}


public static LocalDate getFertileWindowEndDate(LocalDate dateOfEndOfMenstrualCycle){
	LocalDate dateOfFertileWindowEnd = dateOfEndOfMenstrualCycle.minusDays(12);
	return dateOfFertileWindowEnd;
}

public static LocalDate getStartOfSafeDaysAfterFertileWindow(LocalDate dateOfEndOfMenstrualCycle){
	LocalDate startOfSafeDaysAfterFertileWindow = dateOfEndOfMenstrualCycle.minusDays(11);
	return startOfSafeDaysAfterFertileWindow ;

}

}
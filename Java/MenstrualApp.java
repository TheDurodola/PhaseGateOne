import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class MenstrualApp{
	
	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);
	LocalDate todayDate = LocalDate.now();
	
	System.out.print("What is the year: ");
	int yearOfLastCycleStart = input.nextInt();
	System.out.print("What is the month of your last cycle: ");
	int monthOfLastCycleStart = input.nextInt();
	System.out.print("What is the day of your last cycle: ");
	int dayOfLastCycleStart = input.nextInt();
	System.out.print("How many days does your  Menstrual Cycle usually last: ");
	int usualPeriodDuration = input.nextInt();
	System.out.print("How long does your flow days typically last for: ");
	int flowDaysDuration = input.nextInt();

	LocalDate dateOfCurrentMenstrualPeriodBegin = todayDate.of(yearOfLastCycleStart, monthOfLastCycleStart, dayOfLastCycleStart);		
	LocalDate dateOfCurrentMenstrualPeriodEnd = getDateOfCurrentMenstrualPeriodEnd(dateOfCurrentMenstrualPeriodBegin, usualPeriodDuration);
	LocalDate dateOfFlowDaysEnd = getFlowDayEnd(dateOfCurrentMenstrualPeriodBegin, flowDaysDuration);
	LocalDate dateOfPredictFetileDayMiddle  = getDateOfPredictFetileDayMiddle(dateOfCurrentMenstrualPeriodEnd);
	LocalDate dateOfPredictFetileDayBegin  = getStartDayFertile(dateOfPredictFetileDayMiddle);
	LocalDate dateOfPredictFetileDayEnd  = getEndDayFertile(dateOfPredictFetileDayMiddle);
	LocalDate dateOfPredictSafeDaysEnd  = getSafeDayEnd(dateOfPredictFetileDayBegin);
	LocalDate dateOfPredictedStartSafeDayAfterOvulation = getDateOfCurrentMenstrualPeriodEnd(dateOfPredictFetileDayEnd);



	System.out.println("\nYour Current Menstrual Cycle began on " + dateOfCurrentMenstrualPeriodBegin);
	System.out.println("Your Current Menstrual Cycle will end on " + dateOfCurrentMenstrualPeriodEnd);
	System.out.println("\n<>FLOW DAYS<>");
	System.out.print("Your flow period is expected to end on "+ dateOfFlowDaysEnd);		
	System.out.println("\nOvulation Period: " + dateOfPredictFetileDayBegin + " and " + dateOfPredictFetileDayEnd);
	System.out.println("\n<>SAFE DAYS<>");
	System.out.println("\nBefore Ovulation Period: " + dateOfCurrentMenstrualPeriodBegin + " to " + dateOfPredictSafeDaysEnd);
	System.out.println("After Ovulation Period: " + dateOfPredictedStartSafeDayAfterOvulation + " to " + dateOfCurrentMenstrualPeriodEnd);
	

	
	}

static LocalDate getDateOfCurrentMenstrualPeriodEnd(LocalDate dateOfCurrentMenstrualPeriodBegin , int usualPeriodDuration){
if(usualPeriodDuration>0){
if(usualPeriodDuration>=21 && usualPeriodDuration<=35){
LocalDate date = dateOfCurrentMenstrualPeriodBegin.plusDays(usualPeriodDuration-1);
return date;}
if(usualPeriodDuration<=21 && usualPeriodDuration>=35){
System.out.print("WARNING: Your Menstrual Cycle is out of the usual range. Kindly contact a health professional.");
LocalDate date = dateOfCurrentMenstrualPeriodBegin.plusDays(usualPeriodDuration-1);
return date;}
}
return null;

}
	
static LocalDate getFlowDayEnd(LocalDate dateOfCurrentMenstrualPeriodBegin , int flowDaysDuration){
LocalDate date =dateOfCurrentMenstrualPeriodBegin.plusDays(flowDaysDuration);	

return date;
}


static LocalDate getDateOfPredictFetileDayMiddle(LocalDate dateOfCurrentMenstrualPeriodEnd){
LocalDate date = dateOfCurrentMenstrualPeriodEnd.minusDays(14);
return date;
}

static LocalDate getStartDayFertile(LocalDate dateOfPredictFetileDayMiddle){
LocalDate date = dateOfPredictFetileDayMiddle.minusDays(2);
return date;
}

static LocalDate getEndDayFertile(LocalDate dateOfPredictFetileDayMiddle){
LocalDate date = dateOfPredictFetileDayMiddle.plusDays(2);
return date;
}

static LocalDate getSafeDayEnd(LocalDate dateOfPredictFetileDayBegin){
LocalDate date = dateOfPredictFetileDayBegin.minusDays(1);
return date;
}

static LocalDate getDateOfCurrentMenstrualPeriodEnd(LocalDate dateOfPredictFetileDayEnd){
LocalDate date = dateOfPredictFetileDayEnd.plusDays(1);
return date;
}


}
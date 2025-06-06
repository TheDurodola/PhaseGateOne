import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualApp{
	
	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);
	LocalDate todayDate = LocalDate.now();
	
	
	System.out.print("How many days ago did your Menstrual Cycle Begin: ");
	int daysOfLastCycleStart = input.nextInt();
	//LocalDate dateOfCurrentMenstrualPeriodBegin = todayDate.minusDays(daysOfLastCycleStart);	
	LocalDate dateOfCurrentMenstrualPeriodBegin = todayDate.of(2025, 7, 4);	
	
	System.out.print("\nHow many days does your  Menstrual Cycle usually last: ");
	int usualPeriodDuration = input.nextInt();
	System.out.print("How long does your flow days typically last for: ");
	int flowDaysDuration = input.nextInt();

	System.out.println("\nYour Current Menstrual Cycle began on " + dateOfCurrentMenstrualPeriodBegin);
	LocalDate dateOfCurrentMenstrualPeriodEnd = dateOfCurrentMenstrualPeriodBegin.plusDays(usualPeriodDuration-1);
	System.out.println("Your Current Menstrual Cycle will end on " + dateOfCurrentMenstrualPeriodEnd);
	LocalDate dateOfPredictFetileDayMiddle  = dateOfCurrentMenstrualPeriodEnd.minusDays(14);
	LocalDate dateOfPredictFetileDayBegin  = dateOfPredictFetileDayMiddle.minusDays(2);
	LocalDate dateOfPredictFetileDayEnd  = dateOfPredictFetileDayMiddle.plusDays(2);
	LocalDate dateOfPredictedAdditionalFetileDaysBegin  = dateOfPredictFetileDayBegin.minusDays(5);
	System.out.println("\nOvulation Period: " + dateOfPredictedAdditionalFetileDaysBegin + " and " + dateOfPredictFetileDayEnd);
	
	System.out.println("\n<>SAFE DAYS<>");
	LocalDate dateOfPredictSafeDaysEnd  = dateOfPredictFetileDayBegin.minusDays(1);
	LocalDate dateOfPredictedSafeDayAfterOvulation = dateOfPredictFetileDayEnd.plusDays(1);
	System.out.println("\nBafore Ovulation Period: " + dateOfCurrentMenstrualPeriodBegin + " to " + dateOfPredictSafeDaysEnd);
	System.out.println("After Ovulation Period: " + dateOfPredictedSafeDayAfterOvulation + " to " + dateOfCurrentMenstrualPeriodEnd);
	

	System.out.println("\n<>FLOW DAYS<>");
	LocalDate dateOfFlowDaysEnd = dateOfPredictedAdditionalFetileDaysBegin.minusDays(1);
	System.out.print("Your flow days are between "+ dateOfCurrentMenstrualPeriodBegin + " to " + dateOfFlowDaysEnd);
	}

	
	


}
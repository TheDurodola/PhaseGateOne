import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualApp{
	
	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);
	LocalDate todayDate = LocalDate.now();
	
	
	System.out.print("How many days ago did notice that your Menstrual Cycle Began: ");
	int daysOfLastCycleStart = input.nextInt();
	//LocalDate dateOfCurrentMenstrualPeriodBegin = todayDate.minusDays(daysOfLastCycleStart);	
	LocalDate dateOfCurrentMenstrualPeriodBegin = todayDate.of(2025, 8, 3);	
	
	System.out.print("\nHow many days does your  Menstrual Cycle usually last: ");
	int usualPeriodDuration = input.nextInt();

	System.out.println("Your Current Menstrual Cycle began on " + dateOfCurrentMenstrualPeriodBegin);
	LocalDate dateOfCurrentMenstrualPeriodEnd = dateOfCurrentMenstrualPeriodBegin.plusDays(usualPeriodDuration-1);
	System.out.println("Your Current Menstrual Cycle will end on " + dateOfCurrentMenstrualPeriodEnd);
	LocalDate dateOfPredictFetileDayMiddle  = dateOfCurrentMenstrualPeriodEnd.minusDays(14);
	System.out.println(dateOfPredictFetileDayMiddle);
	LocalDate dateOfPredictFetileDayBegin  = dateOfPredictFetileDayMiddle.minusDays(2);
	LocalDate dateOfPredictFetileDayEnd  = dateOfPredictFetileDayMiddle.plusDays(2);
	System.out.print("Your Fertile Window is predicted to between on " + dateOfPredictFetileDayBegin + " and "+ dateOfPredictFetileDayEnd);

	
	}

}
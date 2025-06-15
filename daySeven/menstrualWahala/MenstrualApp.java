import java.util.Scanner;
import java.time.LocalDate;


public class MenstrualApp{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
LocalDate date = LocalDate.now();
System.out.println("WELCOME TO YRSD BOO TING");


int year = date.getYear();
System.out.print("Enter the month your cycle started (Jan=>1): ");
int month = input.nextInt();
System.out.print("Enter the day your cycle started(1-31): ");
int day = input.nextInt();
System.out.print("What is your average cycle duration: ");
int cycleDurationLength = input.nextInt();
System.out.print("What is your average period days: ");
int flowDaysDuration = input.nextInt();



LocalDate dateOfStartOfMenstrualCycle = LocalDate.of(year, month, day);
LocalDate endOfCycle = MenstrualAppFunctions.getDateOfEndOfMenstrualCycle(dateOfStartOfMenstrualCycle, cycleDurationLength);

int loopCondition = 0;

while(loopCondition!=1){
String menuDisplay = """
What would you like to know?

1) End of your cycle
2) End of your flow
3) Ovulation Window
4) Safe Days
0) Exit

Enter your choice: """;

System.out.print(menuDisplay);

int navigator = input.nextInt();

switch(navigator){
	case 1:
		System.out.println("The Day your cycle  is predicated to end is : " + endOfCycle);
		break;
	case 2:
		System.out.println("The Day your period flow is predicated to end is : " + MenstrualAppFunctions.getEndOfFlowDays(dateOfStartOfMenstrualCycle, flowDaysDuration));
		break;
	case 3:
		try{
			System.out.println("Your ovulation window is predicated to be between: " + MenstrualAppFunctions.getFertileWindowStartDate(endOfCycle) + " to " + 	
			MenstrualAppFunctions.getFertileWindowEndDate(endOfCycle));
		}
		catch(NullPointerException npe){
			System.out.println("\nPlease seek Medical Assistance.\n");
		}
		break;
	case 4:
		try{
			System.out.println("Your Safe days before your Ovulation Window are between: " + dateOfStartOfMenstrualCycle + " to " + 	MenstrualAppFunctions.getEndOfFlowDays(dateOfStartOfMenstrualCycle, flowDaysDuration) +"\nYour Safe days after your Ovulation Window are between: "+ 	MenstrualAppFunctions.getStartOfSafeDaysAfterFertileWindow(endOfCycle) +" to "+ endOfCycle);
		}
		catch(NullPointerException npe){
			System.out.println("\nPlease seek Medical Assistance.\n");
		}

		break;
	case 0:
		System.out.print("Good bye, boo.");
		loopCondition=1;
		break;
	default:
		System.out.print("INVALID INPUT!");
}



}

}}
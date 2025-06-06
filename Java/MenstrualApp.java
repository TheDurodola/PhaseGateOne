import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualApp{
	
	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);
	LocalDate currentDate = LocalDate.now();
	
	System.out.print("Enter a day: ");
	int x = input.nextInt();
	LocalDate newDate = currentDate.plusDays(x);
	System.out.print(newDate);

	}

}
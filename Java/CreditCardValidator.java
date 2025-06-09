import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{
public static void main(String...args){
	Scanner input = new Scanner(System.in);

	System.out.print("ENTER THE DIGITS LENGTH: ");
	int digitLength = input.nextInt();

	int [] digits = CreditCardValidatorFunctions.getCardNumberAsArray(digitLength);
	int sum1 = CreditCardValidatorFunctions.getSumOfOddPositionedDigits(digits);
	int sum2 = CreditCardValidatorFunctions.getSumOfEvenPositionedDigits(digits);
	
	CreditCardValidatorFunctions.getCardIssuer(digits);
	CreditCardValidatorFunctions.checkValidity(sum1, sum2);
	
}
}
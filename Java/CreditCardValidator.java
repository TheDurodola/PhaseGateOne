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
	System.out.println("\n\n*********************************************");
	CreditCardValidatorFunctions.getCardIssuer(digits);
	System.out.print("**Credit Card Number: ");
	CreditCardValidatorFunctions.printCardNumber(digits);
	System.out.println("\n**Credit Card Digit Length: "+digitLength);
	CreditCardValidatorFunctions.checkValidity(sum1, sum2);
	System.out.print("*********************************************");
}
}
import java.util.Scanner;

public class CreditCardValidator{
public static void main(String...args){
	

	Scanner input = new Scanner(System.in);


	System.out.print("Enter Card Number: ");
	String cardNumber = input.next();


	//int sum1 = CreditCardValidatorFunctions.getSumOfOddPositionedNumber(cardNumber);
	//int sum2 = CreditCardValidatorFunctions.getSumOfEvenPositionedNumber(cardNumber);


	System.out.printf("******************************************************\n");
	CreditCardValidatorFunctions.getIssuer(cardNumber);
	System.out.printf("**Credit Card Digit Number: %s%n",cardNumber);
	System.out.printf("**Credit Card Digit Number: %d%n", cardNumber.length());
	//CreditCardValidatorFunctions.checkValidity(sum1, sum2);
	System.out.printf("******************************************************");

}
}
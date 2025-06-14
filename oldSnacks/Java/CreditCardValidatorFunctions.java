import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidatorFunctions{

static int[] getCardNumberAsArray(int digitLength){
	Scanner input = new Scanner(System.in);

	int [] digits = new int[digitLength];

	System.out.print("Enter the first four digits: ");
	int cardNumber = input.nextInt();
	int divisor = 1000;
	for(int index = 0; index < 4; index++){
	digits[index] = cardNumber/divisor;
	cardNumber = cardNumber % divisor;
	divisor = divisor/10;
	}
	divisor = 1000;
	System.out.print("Enter the next four digits: ");
	cardNumber = input.nextInt();
	for(int index = 4; index < 8; index++){
	digits[index] = cardNumber/divisor;
	cardNumber = cardNumber % divisor;
	divisor = divisor/10;
	}
	divisor = 1000;
	System.out.print("Enter the next four digits: ");
	cardNumber = input.nextInt();
	for(int index = 8; index < 12; index++){
	digits[index] = cardNumber/divisor;
	cardNumber = cardNumber % divisor;
	divisor = divisor/10;
	}
	if(digits.length==13){divisor = 1;}
	if(digits.length==14){divisor = 10;}
	if(digits.length==15){divisor = 100;}
	if(digits.length==16){divisor = 1000;}
	
	System.out.print("Enter the last digit(s): ");
	cardNumber = input.nextInt();
	for(int index = 12; index < digits.length; index++){
	digits[index] = cardNumber/divisor;
	cardNumber = cardNumber % divisor;
	divisor = divisor/10;
	}

return digits;
}



static void getCardIssuer(int[] array){
if(array[0]==4){System.out.println("**Credit Card Type: VISA");}
else if(array[0]==5){System.out.println("**Credit Card Type: MASTERCARD");}
else if(array[0]==6){System.out.println("**Credit Card Type: DISCOVER");}
else if(array[0]==3 && array[1]==7){System.out.println("**Credit Card Type: AMERICAN EXPRESS");}
else{System.out.println("**Credit Card Type: INVALID CARD");}
}



static int getSumOfOddPositionedDigits(int [] array){
	int [] oddPositionedNumbers = new int[10];
	int counter = 0;
	for(int index = 0; index < array.length; index+=2){
	oddPositionedNumbers[counter] = array[index];
	counter++;
	}
	
	for(int count = 0; count < oddPositionedNumbers.length; count++){
	oddPositionedNumbers[count] = 	oddPositionedNumbers[count] * 2;
		if (oddPositionedNumbers[count] > 9) {
        		int num = oddPositionedNumbers[count];
        		int sum = 0;
       
      			while (num > 0) {
            			sum += num % 10;
            			num = num / 10;
        		}

        		oddPositionedNumbers[count] = sum;
    		}
	}
	int sumOfNumbersInTheArray = 0;
	for(int index = 0; index < oddPositionedNumbers.length; index++){
	sumOfNumbersInTheArray += oddPositionedNumbers[index];
	}
	return sumOfNumbersInTheArray;

}

static int getSumOfEvenPositionedDigits(int [] array){
	int sumOfNumbersInTheArray = 0;
	for(int index = 1; index < array.length; index+=2){
	sumOfNumbersInTheArray += array[index];
	}
	return sumOfNumbersInTheArray;

}

static void checkValidity(int sum1, int sum2){
int mainSum = sum1 + sum2;
if(mainSum%10==0){System.out.println("**Credit Card Validity: VALID");}
if(mainSum%10!=0){System.out.println("**Credit Card Validity: INVALID");}
}

static void printCardNumber(int [] array){
for(int index = 0; index< array.length; index++){
System.out.print(array[index]);
}
}

}
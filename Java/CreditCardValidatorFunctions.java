import java.util.ArrayList;


public class CreditCardValidatorFunctions{


static void getIssuer(String cardNumber){
	int length = cardNumber.length();

	if(length>=13 && length<=16){
	if(cardNumber.charAt(0)=='4'){
	System.out.print("**Credit Card Issuer: VISA\n");
	}
	if(cardNumber.charAt(0)=='5'){
	System.out.print("**Credit Card Issuer: MASTERCARD\n");
	}
	if(cardNumber.charAt(0)=='6'){
	System.out.print("**Credit Card Issuer: DISCOVER\n");
	}
	if(cardNumber.charAt(0)=='3' && cardNumber.charAt(1)== '7'){
	System.out.print("**Credit Card Issuer: AMERICAN EXPRESS\n");
	}
	}
}

/*
function getSumOfOddPositionedNumber(cardNumber){
	int length = cardNumber.toString().length;
	int [] singleDigits = new int[length];


	if(length >= 13 && length <= 16){
		int divisor = 0;
	
		if (length == 13){
			divisor = 1000000000000	};
		if (length == 14){
			divisor = 10000000000000};
		if (length == 15){
			divisor = 100000000000000};
		if (length == 16){
			divisor = 1000000000000000};
	
		for(int index = 0; index < length; index++){ 
			int digitPicker = Math.floor(cardNumber/divisor)
				listOfSingleDigits.push(digitPicker)
				cardNumber = cardNumber % divisor
				divisor = divisor / 10
		};

	};



	int listOfNumbers = []
	int listPicker = 0

	while (listPicker < listOfSingleDigits.length){
		listOfNumbers.push(listOfSingleDigits[listPicker])
		listPicker += 2
	};

	for (int index = 0; index < listOfNumbers.length; index++) {
    listOfNumbers[index] = listOfNumbers[index] * 2;
    
    if (listOfNumbers[index] > 9) {
        int num = listOfNumbers[index];
        int sum = 0;
       
        while (num > 0) {
            sum += num % 10;
            num = Math.floor(num / 10);
        }

        listOfNumbers[index] = sum;
    }
}
	


sumOfOddPositionedNumbers = 0
	for(int index = 0; index< listOfNumbers.length; index++){
		sumOfOddPositionedNumbers +=  listOfNumbers[index] 
	}
	return sumOfOddPositionedNumbers
};


function getSumOfEvenPositionedNumber(cardNumber){
	int listOfSingleDigits = [];
	int length = cardNumber.toString().length;

	if(length >= 13 && length <= 16){
		int divisor = 0;
	
		if (length == 13){
			divisor = 1000000000000	};
		if (length == 14){
			divisor = 10000000000000};
		if (length == 15){
			divisor = 100000000000000};
		if (length == 16){
			divisor = 1000000000000000};
	
		for(int index = 0; index < length; index++){ 
			int digit_picker = Math.floor(cardNumber/divisor)
				listOfSingleDigits.push(digit_picker)
				cardNumber = cardNumber % divisor
				divisor = divisor / 10
		};

	};

	int listPicker = 1;
	int sum = 0;
while(listPicker < listOfSingleDigits.length){
	sum = sum += listOfSingleDigits[listPicker];
	listPicker += 2;

};

return sum

};





function checkValidity(sum1,sum2){
int mainSum = sum1+sum2;
if(mainSum%10==0){
System.out.print("**Credit Card Validity: VALID")};
if(mainSum%10!=0){
System.out.print("**Credit Card Validity: INVALID")};
};*/


}
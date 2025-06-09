const input = require("prompt-sync");
const prompt = input();


let cardNumber = Number(prompt("Enter Card Number: "));


sum1 = getSumOfOddPositionedNumber(cardNumber);
sum2 = getSumOfEvenPositionedNumber(cardNumber);


console.log("******************************************************");
getIssuer(cardNumber);
console.log("**Credit Card Digit Number: ",cardNumber);
console.log("**Credit Card Digit Length: ",cardNumber.toString().length);
checkValidity(sum1, sum2);
console.log("******************************************************");

















function getIssuer(cardNumber){
	let listOfSingleDigits = [];
	let length = cardNumber.toString().length;

	if(length >= 13 && length <= 16){
		let divisor = 0;
	
		if (length == 13){
			divisor = 1000000000000	};
		if (length == 14){
			divisor = 10000000000000};
		if (length == 15){
			divisor = 100000000000000};
		if (length == 16){
			divisor = 1000000000000000};
	
		for(let index = 0; index < length; index++){ 
			let digit_picker = Math.floor(cardNumber/divisor)
				listOfSingleDigits.push(digit_picker)
				cardNumber = cardNumber % divisor
				divisor = divisor / 10
		};

	};

if (listOfSingleDigits[0] == 4){
	console.log("**Credit Card Type: VISA")}
else if (listOfSingleDigits[0] == 5){
	console.log("**Credit Card Type: MASTERCARD")}
else if (listOfSingleDigits[0] == 6){
	console.log("**Credit Card Type: DISCOVER")}
else if (listOfSingleDigits[0] == 3 && listOfSingleDigits[1] == 7){
	console.log("**Credit Card Type: AMERICAN EXPRESS");
} else {
console.log("**Credit Card Type: INVALID CARD")};
};


function getSumOfOddPositionedNumber(cardNumber){
	let listOfSingleDigits = [];
	let length = cardNumber.toString().length;

	if(length >= 13 && length <= 16){
		let divisor = 0;
	
		if (length == 13){
			divisor = 1000000000000	};
		if (length == 14){
			divisor = 10000000000000};
		if (length == 15){
			divisor = 100000000000000};
		if (length == 16){
			divisor = 1000000000000000};
	
		for(let index = 0; index < length; index++){ 
			let digitPicker = Math.floor(cardNumber/divisor)
				listOfSingleDigits.push(digitPicker)
				cardNumber = cardNumber % divisor
				divisor = divisor / 10
		};

	};



	let listOfNumbers = []
	let listPicker = 0

	while (listPicker < listOfSingleDigits.length){
		listOfNumbers.push(listOfSingleDigits[listPicker])
		listPicker += 2
	};

	for (let index = 0; index < listOfNumbers.length; index++) {
    listOfNumbers[index] = listOfNumbers[index] * 2;
    
    if (listOfNumbers[index] > 9) {
        let num = listOfNumbers[index];
        let sum = 0;
       
        while (num > 0) {
            sum += num % 10;
            num = Math.floor(num / 10);
        }

        listOfNumbers[index] = sum;
    }
}
	


sumOfOddPositionedNumbers = 0
	for(let index = 0; index< listOfNumbers.length; index++){
		sumOfOddPositionedNumbers +=  listOfNumbers[index] 
	}
	return sumOfOddPositionedNumbers
};


function getSumOfEvenPositionedNumber(cardNumber){
	let listOfSingleDigits = [];
	let length = cardNumber.toString().length;

	if(length >= 13 && length <= 16){
		let divisor = 0;
	
		if (length == 13){
			divisor = 1000000000000	};
		if (length == 14){
			divisor = 10000000000000};
		if (length == 15){
			divisor = 100000000000000};
		if (length == 16){
			divisor = 1000000000000000};
	
		for(let index = 0; index < length; index++){ 
			let digit_picker = Math.floor(cardNumber/divisor)
				listOfSingleDigits.push(digit_picker)
				cardNumber = cardNumber % divisor
				divisor = divisor / 10
		};

	};

	let listPicker = 1;
	let sum = 0;
while(listPicker < listOfSingleDigits.length){
	sum = sum += listOfSingleDigits[listPicker];
	listPicker += 2;

};

return sum

};





function checkValidity(sum1,sum2){
mainSum = sum1+sum2;
if(mainSum%10==0){
console.log("**Credit Card Validity: VALID")};
if(mainSum%10!=0){
console.log("**Credit Card Validity: INVALID")};
};
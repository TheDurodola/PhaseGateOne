const input = require("prompt-sync");
const prompt = input();
const now = new Date();
const year = now.getFullYear();

function endOfCycle(date, daysOfCycleDurationOfCycleDuration){
const result = new Date(date);
result.setDate(result.getDate() + daysOfCycleDuration-1)
return result;
};


function endOfFlowPeriod(date, daysOfFlowDuration){
const result = new Date(date);
result.setDate(result.getDate() + daysOfFlowDuration)
return result;
};



function startOfFertileWindow(date, daysOfCycleDuration){
const result = new Date(date);
result.setDate(result.getDate() + daysOfCycleDuration)
result.setDate(result.getDate() - 16)
return result;
};


function endOfFertileWindow(date, daysOfCycleDuration){
const result = new Date(date);
result.setDate(result.getDate() + daysOfCycleDuration)
result.setDate(result.getDate() - 12)
return result;
};

function safePeriodAfterOvulation(date, daysOfCycleDuration){
const result = new Date(date);
result.setDate(result.getDate() + daysOfCycleDuration)
result.setDate(result.getDate() - 11)
return result;
};

const welcomeMessage = `
WELCOME TO YRSD BOO TING

Kindly enter the following details`;

console.log(welcomeMessage);
let month = Number(prompt("Enter the month of your last cycle(MM): "));
let day = Number(prompt("Enter the day of your last cycle(DD): "));
let daysOfCycleDuration = Number(prompt("How long does your cycle typically last: "));
let daysOfFlowDuration = Number(prompt("How long does your flow typically last: "));
const date = new Date(year, (month-1), (day+1));


let loopCondition = 0
while(loopCondition!=1){
const mainMenuDisplay = `
	What would you like to know?

1) End Date of Cycle
2) End Date of Period Flow
3) Ovulation Window
4) Safe Period
0) Exit`;

console.log(mainMenuDisplay);
let mainMenuNavigator = Number(prompt("Enter your move(1-4):  "));

switch(mainMenuNavigator){
	case 1:
		console.log("The end of your cycle would be ", endOfCycle(date, daysOfCycleDuration));
		break;
	case 2:
		console.log("The predicted end of your flow period would be ", endOfFlowPeriod(date, daysOfFlowDuration));
		break;
	case 3:
		console.log("The start of your Ovulation window would be ", startOfFertileWindow(date, daysOfCycleDuration));
		console.log("The end of your ovulation period would be ",endOfFertileWindow(date, daysOfCycleDuration));
		break;
	case 4:
		console.log("Your safe period after your your Ovulation window would be",safePeriodAfterOvulation(date, daysOfCycleDuration), "to", endOfCycle(date, daysOfCycleDuration));
		break;
	case 0:
		console.log("Good bye, boo.");
		loopCondition = 1;
		break;

	default:
		console.log("INVALID OPTION");
};
};
const input = require("prompt-sync");
const prompt = input();
let year = Number(prompt("Enter the year(YYYY): "));
let month = Number(prompt("Enter the month of your last cycle(MM): "));
let day = Number(prompt("Enter the day of your last cycle(DD): "));
let daysOfCycleDuration = Number(prompt("How long does your cycle typically last: "));
let daysOfFlowDuration = Number(prompt("How long does your flow typically last: "));


const date = new Date(year, (month-1), (day+1));

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
result.setDate(result.getDate() + 11)
return result;
};


console.log(endOfCycle(date, daysOfCycleDuration));
console.log(endOfFlowPeriod(date, daysOfFlowDuration));
console.log(startOfFertileWindow(date, daysOfCycleDuration));
console.log(endOfFertileWindow(date, daysOfCycleDuration));
console.log(safePeriodAfterOvulation(date, daysOfCycleDuration));

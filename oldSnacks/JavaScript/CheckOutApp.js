const input = require("prompt-sync");
const prompt = input();

const itemNames = [];
const itemPrices = [];
const itemQuantities = [];
const totalOfItem = [];


const customerName = prompt("What is the customer's name: ");

while (true) {
    const itemName = prompt("What did the user buy: ");
    const itemPrice = Number(prompt("How many pieces: "));
    const itemQuantity = Number(prompt("How much per unit: "));

    itemNames.push(itemName);
    itemPrices.push(itemPrice);
    itemQuantities.push(itemQuantity);

    const more = prompt("Add more item? (yes/no): ");
    if (more === "no") break;
};

const cashierName = prompt("What is your name: ");
const discountPercent = Number(prompt("How much discount will he/she get (%): "));

for (let count = 0; count < itemNames.length; count++) {
    const total = itemPrices[count] * itemQuantities[count];
    totalOfItem.push(total);

};

let subTotal = 0;
for (let index = 0; index < itemNames.length; index++) {
    subTotal += itemPrices[index] * itemQuantities[index];
};

const discount = subTotal * discountPercent / 100;
const vat = (subTotal - discount) * 0.075;
const totalBill = (subTotal - discount) + vat;

console.log("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 080419419419\nDate: 25-DEC-25 8:45:32 PM");
console.log(`Cashier: ${cashierName}`);
console.log(`Customer Name: ${customerName}`);
console.log("======================================================");
console.log("\t\t\tITEM\tQTY\tPRICE\tTOTAL");
console.log("======================================================");
for (let count = 0; count < itemNames.length; count++) {
      console.log(`\t\t\t${itemNames[count]}\t${itemQuantities[count]}\t${itemPrices[count]}\t${totalOfItem[count]}`);
};
console.log("------------------------------------------------------");
console.log(`\t\t\t\tSubtotal: ${subTotal}`);
console.log(`\t\t\t\tDiscount: ${discount}`);
console.log(`\t\t\t\tVAT @ 7.5%: ${vat}`);
console.log("======================================================");
console.log(`\t\t\tTotal Bill: ${totalBill}`);
console.log("======================================================");
console.log(`THIS IS NOT A RECEIPT. KINDLY PAY ${totalBill}`);
console.log("======================================================");


const amountPaid = Number(prompt("How much did the customer give to you: "));
const balance = amountPaid - totalBill;

console.log("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 080419419419\nDate: 25-DEC-25 8:45:32 PM");
console.log(`Cashier: ${cashierName}`);
console.log(`Customer Name: ${customerName}`);
console.log("======================================================");
console.log("\t\t\tITEM\tQTY\tPRICE\tTOTAL");
console.log("======================================================");
for (let count = 0; count < itemNames.length; count++) {
      console.log(`\t\t\t${itemNames[count]}\t${itemQuantities[count]}\t${itemPrices[count]}\t${totalOfItem[count]}`);
};
console.log("------------------------------------------------------");
console.log(`\t\t\t\tSubtotal: ${subTotal}`);
console.log(`\t\t\t\tDiscount: ${discount}`);
console.log(`\t\t\t\tVAT @ 7.5%: ${vat}`);
console.log("======================================================");
console.log(`\t\t\tTotal Bill: ${totalBill}`);
console.log(`\t\t\tAmount Paid: ${amountPaid}`);
console.log(`\t\t\tBalance: ${balance}`);
console.log("======================================================");
console.log(`\tTHANK FOR YOUR PATRONAGE`);
console.log("======================================================");






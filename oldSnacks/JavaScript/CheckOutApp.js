const input = require("prompt-sync");
const prompt = input();

let itemNames = [];
let itemPrices = [];
let itemQuantities = [];

const customerName = prompt("Customer Name: ");

while (true) {
    const itemName = prompt("Item Name: ");
    const itemPrice = Number(prompt("Item Price: "));
    const itemQuantity = Number(prompt("Item Quantity: "));

    itemNames.push(itemName);
    itemPrices.push(itemPrice);
    itemQuantities.push(itemQuantity);

    let more = prompt("Add another item? (yes/no): ");
    if (more === "no") break;
}

const cashierName = prompt("Cashier Name: ");
const discountPercent = Number(prompt("Discount (%): "));
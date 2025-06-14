import java.util.ArrayList;
import java.util.Scanner;


public class CheckOutApp{

public static void main(String...args){

ArrayList<String> itemNames = new ArrayList<>();
ArrayList<Integer> itemPrices = new ArrayList<>();
ArrayList<Integer> itemQuantities = new ArrayList<>();
ArrayList<Integer> itemTotalAmount = new ArrayList<>();
Scanner input = new Scanner(System.in);


System.out.print("What is the Customer name: ");
String customerName = input.next();

int loopCondition = 0;

while(loopCondition!=1){
System.out.print("\nWhat is the Item Name: ");
String itemName = input.next();
System.out.print("What is the Item Price: ");
int itemPrice = input.nextInt();
System.out.print("What is the Item Quantity: ");
int itemQuantity = input.nextInt();

System.out.println("Do you wish to add another item (0-No, Any Other Number - Yes): ");
int addItem = input.nextInt();
CheckOutAppFunctions.addItemNameToItemNamesList(itemName, itemNames);
CheckOutAppFunctions.addItemPriceToItemPriceList(itemPrice, itemPrices);
CheckOutAppFunctions.addItemQuantityToItemQuantityList(itemQuantity, itemQuantities);

switch(addItem){
	case 0:
		loopCondition = 1;
		break;
	default:
		System.out.println("\nProceed to add another item\n");

}

}

System.out.print("What is your name: ");
String cashierName = input.next();

System.out.print("What is the discount: ");
int discountInPercentage = input.nextInt();
itemTotalAmount = CheckOutAppFunctions.getTotalAmountArrayList(itemTotalAmount, itemPrices, itemQuantities);

CheckOutAppFunctions.printInvoice(cashierName, customerName, itemNames, itemPrices, itemQuantities, itemTotalAmount, discountInPercentage);

System.out.print("How much did the customer pay: NGN");
int AmountPaidByCustomer = input.nextInt();

CheckOutAppFunctions.printReceipt(cashierName, customerName, itemNames, itemQuantities, itemPrices, itemTotalAmount, discountInPercentage, AmountPaidByCustomer);

}
}
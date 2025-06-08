import java.util.ArrayList;
public class CheckOutAppFunctions{
	
	static ArrayList<String> addItemNameToItemNamesList(String itemName, ArrayList<String> itemNameList){
	itemNameList.add(itemName);
	return itemNameList;
	}

	static ArrayList<Integer> addItemPriceToItemPriceList(int itemPrice, ArrayList<Integer> itemPriceList){
	itemPriceList.add(itemPrice);
	return itemPriceList;
	}

	static ArrayList<Integer> addItemQuantityToItemQuantityList(int itemQuantity, ArrayList<Integer> itemQuantityList){
	itemQuantityList.add(itemQuantity);
	return itemQuantityList;
	}

	static ArrayList<Integer> getTotalAmountArrayList(ArrayList<Integer> itemTotalAmount, ArrayList<Integer> itemPriceList, ArrayList<Integer> itemQuantityList){
	int total = 0;
	for(int index = 0; index < itemPriceList.size(); index++){
	total = (itemPriceList.get(index) * itemQuantityList.get(index));
	itemTotalAmount.add(total);
	}
	return itemTotalAmount;
	}
	
	
	static int getSubTotalAmount(ArrayList<Integer> itemPriceList , ArrayList<Integer> itemQuantityList){
	int total = 0;
	System.out.print(itemPriceList.size());
	for(int index = 0; index < itemPriceList.size(); index++){
	total = total + (itemPriceList.get(index) * itemQuantityList.get(index));
	}
	return total;
	}
	
	static double getDiscountedAmount(ArrayList<Integer> itemPriceList, ArrayList<Integer> itemQuantityList, int discountInPercentage){

	int totalAmount = 0;
	for(int index = 0; index < itemPriceList.size(); index++){
	totalAmount = totalAmount + (itemPriceList.get(index) * itemQuantityList.get(index));
	}

	int discountToBeDeducted = totalAmount * discountInPercentage/100;
	return discountToBeDeducted;
	}

	static double getVATAmount(ArrayList<Integer> itemPriceList , ArrayList<Integer> itemQuantityList, int discountInPercentage){
	
	int totalAmount = 0;
	for(int index = 0; index < itemPriceList.size(); index++){
	totalAmount = totalAmount + (itemPriceList.get(index) * itemQuantityList.get(index));
	}
	
	int discountToBeDeducted = totalAmount * discountInPercentage/100;
	double discountAmount = totalAmount - discountToBeDeducted;

	double amountVAT = discountAmount * 0.075;
	return amountVAT;
	}
	
	static double getBillTotal(ArrayList<Integer> itemPriceList , ArrayList<Integer> itemQuantityList, int discountInPercentage){
	
	int totalAmount = 0;
	for(int index = 0; index < itemPriceList.size(); index++){
	totalAmount = totalAmount + (itemPriceList.get(index) * itemQuantityList.get(index));
	}
	
	int discountToBeDeducted = totalAmount * discountInPercentage/100;
	double discountAmount = totalAmount - discountToBeDeducted;

	double amountVAT = discountAmount * 0.075;
	double amountAfterVAT = discountAmount + amountVAT;
	return amountAfterVAT;
	}



	static double getBalance(ArrayList<Integer> itemPriceList , ArrayList<Integer> itemQuantityList, int discountInPercentage, int AmoundPaidByCustomer){

	int totalAmount = 0;
	for(int index = 0; index < itemPriceList.size(); index++){
	totalAmount = totalAmount + (itemPriceList.get(index) * itemQuantityList.get(index));
	}
	
	int discountToBeDeducted = totalAmount * discountInPercentage/100;
	double discountAmount = totalAmount - discountToBeDeducted;

	double amountVAT = discountAmount * 0.075;
	double amountAfterVAT = discountAmount + amountVAT;

	double balance = AmoundPaidByCustomer - amountAfterVAT;
	return balance;
	}

	
	static void printInvoice(String nameOfCashier,String nameOfCustomer, ArrayList<String> itemNameList, ArrayList<Integer> itemQuantityList, ArrayList<Integer> itemPriceList, ArrayList<Integer> itemTotalAmount, int discountInPercentage){
	System.out.print("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 080419419419\nDate: 18-Dec-25 8:45:32 PM\n");
	System.out.printf("Cashier: %s%n", nameOfCashier);
	System.out.printf("Customer name: %s%n", nameOfCustomer);
		System.out.print("==========================================================\n");
	System.out.printf("\t\t\tITEM\tQTY\tPRICE\tTOTAL(NGN)%n");
	System.out.println("----------------------------------------------------------");
	for(int index = 0; index < itemNameList.size(); index++){
	System.out.printf("\t\t\t%s\t%d\t%d\t%d%n", itemNameList.get(index), itemPriceList.get(index), itemQuantityList.get(index), itemTotalAmount.get(index)); 
	}
System.out.println("\n----------------------------------------------------------");
System.out.printf("\t\t\t\t\tSubTotal:%d\n", getSubTotalAmount(itemPriceList, itemQuantityList));
System.out.printf("\t\t\t\t\tDiscount:%.2f\n", getDiscountedAmount(itemPriceList, itemQuantityList, discountInPercentage));
System.out.printf("\t\t\t\t\tVAT @ 7.5 %.2f\n", getVATAmount(itemPriceList, itemQuantityList, discountInPercentage));
System.out.print("==========================================================\n");
System.out.printf("\t\t\t\t      Bill Total: %.2f", getBillTotal(itemPriceList, itemQuantityList, discountInPercentage));
System.out.print("\n==========================================================\n");
System.out.printf("THIS IS NOT A RECEIPT. KINDLY PAY NGN%.2f", getBillTotal(itemPriceList, itemQuantityList, discountInPercentage));
System.out.print("\n==========================================================\n");
	}







}
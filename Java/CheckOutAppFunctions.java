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

	static int getTotalAmount(ArrayList<Integer> itemPriceList , ArrayList<Integer> itemQuantityList){
	int total = 0;
	for(int index = 0; index < itemPriceList.size(); index++){
	total = total + (itemPriceList.get(index) * itemQuantityList.get(index));
	}
	return total;
	}
	
	static double getDiscountedAmount(int totalAmount, int discountInPercentage){
	int discountToBeDeducted = totalAmount * discountInPercentage/100;
	double discountAmount = totalAmount - discountToBeDeducted;
	return discountAmount;
	}

	static double getAmountAfterVAT(double amount){
	double amountVAT = amount * 0.075;
	double amountAfterVAT = amount - amountVAT;
	return amountAfterVAT;
	}

}
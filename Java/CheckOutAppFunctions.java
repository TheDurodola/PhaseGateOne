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

}
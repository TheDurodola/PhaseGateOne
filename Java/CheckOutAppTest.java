import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckOutAppTest{

	@Test
	void testSaveItemNameWork(){
	ArrayList<String> itemNames = new ArrayList<>();
	ArrayList<String> actual = CheckOutAppFunctions.addItemNameToItemNamesList("Apple", itemNames);
	
	ArrayList<String> expected = new ArrayList<String>();
	expected.add("Apple");
	assertEquals(actual, expected);
	}

	@Test
	void testSaveItemPriceWork(){
	ArrayList<Integer> itemPrices = new ArrayList<>();
	ArrayList<Integer> actual = CheckOutAppFunctions.addItemPriceToItemPriceList(1500, itemPrices);
	
	ArrayList<Integer> expected = new ArrayList<>();
	expected.add(1500);
	assertEquals(actual, expected);
	}


	@Test
	void testSaveItemQuantityWork(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> actual = CheckOutAppFunctions.addItemQuantityToItemQuantityList(2, itemQuantity);
	
	ArrayList<Integer> expected = new ArrayList<>();
	expected.add(2);
	assertEquals(actual, expected);
	}
	
	@Test
	void testThatGetTotalAmountWorks(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> itemPrices = new ArrayList<>();
	itemQuantity.add(2);
	itemPrices.add(1500);
	itemQuantity.add(3);
	itemPrices.add(2000);


	int actual = CheckOutAppFunctions.getTotalAmount(itemQuantity, itemPrices);
	int expected = 9000;
	
	assertEquals(actual, expected);
	}







}
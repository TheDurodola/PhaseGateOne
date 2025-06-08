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
	void testTheGetTotalAmountWork(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> itemPrices = new ArrayList<>();
	ArrayList<Integer> itemTotalAmount = new ArrayList<>();
	itemQuantity.add(2);
	itemPrices.add(1500);
	itemQuantity.add(1);
	itemPrices.add(2000);
	itemTotalAmount = CheckOutAppFunctions.getTotalAmountArrayList(itemTotalAmount, itemPrices, itemQuantity);
	
	ArrayList<Integer> expected = new ArrayList<>();
	expected.add(3000);
	expected.add(2000);
	assertEquals(itemTotalAmount, expected);
	}
	
	@Test
	void testThatGetSubTotalAmountWork(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> itemPrices = new ArrayList<>();
	itemQuantity.add(2);
	itemPrices.add(1500);
	itemQuantity.add(3);
	itemPrices.add(2000);
	itemQuantity.add(1);
	itemPrices.add(1000);

	int actual = CheckOutAppFunctions.getSubTotalAmount(itemQuantity, itemPrices);
	int expected = 10000;
	
	assertEquals(actual, expected);
	}


	@Test
	void testThatGetTheDiscountedAmountWorks(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> itemPrices = new ArrayList<>();
	itemQuantity.add(2);
	itemPrices.add(1500);
	itemQuantity.add(3);
	itemPrices.add(2000);
	itemQuantity.add(1);
	itemPrices.add(1000);
	int discount = 8;
	
	double actual = CheckOutAppFunctions.getDiscountedAmount(itemQuantity, itemPrices, discount);
	double expected = 9200;
	assertEquals(actual, expected);
	}

	@Test
	void testThatGetBillTotal(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> itemPrices = new ArrayList<>();
	itemQuantity.add(2);
	itemPrices.add(1500);
	itemQuantity.add(3);
	itemPrices.add(2000);
	itemQuantity.add(1);
	itemPrices.add(1000);
	int discount = 8;

	double actual =  CheckOutAppFunctions.getBillTotal(itemQuantity, itemPrices, discount);
	double expected = 8510;
	assertEquals(actual, expected);
	}

	@Test
	void TestGetBalance(){
	ArrayList<Integer> itemQuantity = new ArrayList<>();
	ArrayList<Integer> itemPrices = new ArrayList<>();
	itemQuantity.add(2);
	itemPrices.add(1500);
	itemQuantity.add(3);
	itemPrices.add(2000);
	itemQuantity.add(1);
	itemPrices.add(1000);
	int discount = 8;

	int amountPaid = 11000;
	double actual = CheckOutAppFunctions.getBalance(itemQuantity, itemPrices, discount, amountPaid);
	double expected = 2490;
	assertEquals(actual, expected);
	}

	





}
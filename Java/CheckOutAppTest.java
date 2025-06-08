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



}
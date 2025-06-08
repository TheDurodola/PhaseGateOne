import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutAppTest{

	@Test
	void testSaveItemNameExist(){
	ArrayList<String> itemNames = new ArrayList<>();
	CheckOutAppFunctions.addItemNameToItemList("Apple", itemNames);
	
	}




}
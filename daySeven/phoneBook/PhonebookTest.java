import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PhonebookTest{


	@Test
	void testAddContactToPhonebookDatabaseWorks(){
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	ArrayList<String[]> actual = PhonebookFunctions.addContact(phonebookDatabase,"Bolaji", "Durodola", "08146661419");
	ArrayList<String[]> expected = new ArrayList<>();
	String [] test = {"Bolaji","Durodola", "08146661419"};
	expected.add(test);
	assertArrayEquals(actual.get(0), expected.get(0));
	}





}
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhonebookTest{


	@Test
	void testAddContactToPhonebookDatabaseWorks(){
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	ArrayList<String[]> actual = PhonebookFunctions.addContact(phonebookDatabase,"Bolaji", "Durodola", "08146661419");
	ArrayList<String[]> expected = new ArrayList<>();
	String [] test = {"Bolaji","Durodola", "08146661419"};
	expected.add(test);
	assertEquals(actual, expected);
	}





}
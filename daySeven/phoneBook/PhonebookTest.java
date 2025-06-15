import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PhonebookTest{


	@Test
	void testAddContactWorks(){
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	
	ArrayList<String[]> actual = PhonebookFunctions.addContact(phonebookDatabase,"Bolaji", "Durodola", "08146661419");
	ArrayList<String[]> expected = new ArrayList<>();
	String [] test = {"Bolaji","Durodola", "08146661419"};
	expected.add(test);
	assertArrayEquals(actual.get(0), expected.get(0));
	}

	@Test
	void testAddContactRejectsDuplicatedNumberInput(){
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	phonebookDatabase.add(new String[]{"Bolaji", "Adaramoye", "0708230670"});
 	phonebookDatabase.add(new String[]{"Bolaji", "Durodola", "08146661419"});
	int actual = (PhonebookFunctions.addContact(phonebookDatabase,"Bella", "BigBumBum", "08146661419")).size();
	int  expected = 2;
	assertEquals(actual, expected);
	}


	@Test
	void testAddContactRejectsNumberThatAreNot11Digits(){
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	ArrayList<String[]> actual = PhonebookFunctions.addContact(phonebookDatabase,"Bolaji", "Durodola", "0814666141");
	ArrayList<String[]> expected = new ArrayList<>();
	assertEquals(actual, expected);
	}

	@Test
	void testAddContactRejectsNameInputThatContainWhiteSpaceOnly(){
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	ArrayList<String[]> actual = PhonebookFunctions.addContact(phonebookDatabase," ", " ", "08146661410");
	ArrayList<String[]> expected = new ArrayList<>();
	assertEquals(actual, expected);
	}

	







}
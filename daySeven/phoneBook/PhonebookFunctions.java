import java.util.ArrayList;
import java.util.Arrays;

public class PhonebookFunctions{

	static ArrayList<String[]> addContact(ArrayList<String[]> database, String firstName, String lastName, String phoneNumber){
		String [] contactDetails = {firstName, lastName, phoneNumber};
		database.add(contactDetails);
		return database;
	}


}
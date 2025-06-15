import java.util.ArrayList;
import java.util.Arrays;

public class PhonebookFunctions{

	static ArrayList<String[]> addContact(ArrayList<String[]> database, String firstName, String lastName, String phoneNumber){
		for(int index = 0; index < database.size(); index++){
			if(phoneNumber == database.get(index)[2]){
				System.out.print("Contact Number Already Exists");
				return database;
			}
		}


		if(phoneNumber.length()==11 && !firstName.isBlank()  && !lastName.isBlank()){
			String [] contactDetails = {firstName, lastName, phoneNumber};
			database.add(contactDetails);
			System.out.print("Contact Add\n");
			return database;
		}
		System.out.print("FAILED. Make sure info is valid");
		return database;
	}


	
	static ArrayList<String[]> deleteContact(ArrayList<String[]> database, int selectedContact){
		database.remove(selectedContact-1);
		System.out.print("Contact Removed.");
		return database;
	}

	static void findViaFirstName(ArrayList<String[]> database, String firstName){
	for(int index = 0; index < database.size(); index++){
			if(firstName == database.get(index)[0]){
				System.out.printf("First Name: %s\nLast Name: %s\n Phone Number: %s\n", database.get(index)[0],database.get(index)[1],database.get(index)[0]);
				return;
			}
		}


	}

	static void findViaLastName(ArrayList<String[]> database, String lastName){

	}


	static void findViaPhoneNumber(ArrayList<String[]> database, String phoneNumber){

	}


}
import java.util.ArrayList;
import java.util.Arrays;

public class PhonebookFunctions{

	static ArrayList<String[]> addContact(ArrayList<String[]> database, String firstName, String lastName, String phoneNumber){
		for(int index = 0; index < database.size(); index++){
			if(phoneNumber.equals(database.get(index)[2])){
				System.out.print("\nContact Number Already Exists");
				return database;
			}
		}


		if(phoneNumber.length()==11 && !firstName.isBlank()  && !lastName.isBlank()){
			String [] contactDetails = {firstName, lastName, phoneNumber};
			database.add(contactDetails);
			System.out.print("Contact Added.\n");
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
			if(firstName.equals(database.get(index)[0])){
				System.out.printf("First Name: %s\nLast Name: %s\nPhone Number: %s\n", database.get(index)[0],database.get(index)[1],database.get(index)[2]);
				return;
			}
		}

	System.out.print("Contact Doesn't Exist.\n");
	}

	static void findViaLastName(ArrayList<String[]> database, String lastName){
	for(int index = 0; index < database.size(); index++){
			if(lastName.equals(database.get(index)[1])){
				System.out.printf("First Name: %s\nLast Name: %s\nPhone Number: %s\n", database.get(index)[0],database.get(index)[1],database.get(index)[2]);
				return;
			}
		}
	System.out.print("Contact Doesn't Exist.\n");
	}


	static void findViaPhoneNumber(ArrayList<String[]> database, String phoneNumber){
	for(int index = 0; index < database.size(); index++){
			if(phoneNumber.equals(database.get(index)[2])){
				System.out.printf("First Name: %s\nLast Name: %s\nPhone Number: %s\n", database.get(index)[0],database.get(index)[1],database.get(index)[2]);
				return;
			}
		}
	System.out.print("Contact Doesn't Exist.\n");
	}


	static ArrayList<String[]> editFirstName(ArrayList<String[]> database, String firstName, int selection){
	database.get(selection-1)[0] = firstName;
	System.out.print("Edited.");
	return database;

	}


	static ArrayList<String[]> editLastName(ArrayList<String[]> database, String lastName, int selection){
	database.get(selection-1)[1] = lastName;
	System.out.print("Edited.");
	return database;

	}
	static ArrayList<String[]> editPhoneNumber(ArrayList<String[]> database, String phoneNumber, int selection){
	database.get(selection-1)[2] = phoneNumber;
	System.out.print("Edited.");
	return database;
	}





}
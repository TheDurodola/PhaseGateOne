import java.util.ArrayList;
import java.util.Scanner;


public class Phonebook{

	public static void main(String...args){
	
	ArrayList<String[]> phonebookDatabase = new ArrayList<>();
	Scanner input = new Scanner(System.in);

int loopCondition = 0;
while(loopCondition == 0){
	String mainMenuDisplay = """
\n\t\tThe YRSD Phonebook

1) Add Contact
2) Remove Contact
3) Find Contact
4) Edit Contact

0) Exit

Input: """;
	System.out.print(mainMenuDisplay);
	int mainMenuNavigator = input.nextInt();
	switch(mainMenuNavigator){
	case 1:
		System.out.print("Enter the first name:");
		String firstName = input.next();
		System.out.print("Enter the last name:");
		String lastName = input.next();
		System.out.print("Enter the phone number:");
		String phoneNumber = input.next();
		PhonebookFunctions.addContact(phonebookDatabase, firstName, lastName, phoneNumber);
		break;
	case 2:
		for(int index = 0; index < phonebookDatabase.size(); index++){
		System.out.printf("%d   %s%n", index+1, phonebookDatabase.get(index)[0]);	
		}
		System.out.print("What contact would you like to delete: ");
		int selection = input.nextInt();
		try{
			PhonebookFunctions.deleteContact(phonebookDatabase, selection);
		}
		catch(IndexOutOfBoundsException iobe){
			System.out.print("ERROR. Invalid Contact selection");
		}
		break;

	case 3:
		System.out.print("1) Find by First Name\n2) Find by Last Name\n3) Find by Phone Number\n\nEnter your choose: ");
		int navigate = input.nextInt();

		switch(navigate){
		case 1:
			System.out.print("Enter the first name: ");
			String firstNameFind = input.next();
			PhonebookFunctions.findViaFirstName(phonebookDatabase, firstNameFind);
			System.out.print("Enter any key to exit: ");
			String exit1 = input.next();
			break;
		case 2:
			System.out.print("Enter the last name: ");
			String lastNameFind = input.next();
			PhonebookFunctions.findViaLastName(phonebookDatabase, lastNameFind);
			System.out.print("Enter any key to exit: ");
			String exit2 = input.next();
			break;
		case 3:
			System.out.print("Enter the phone number: ");
			String phoneNumberFind = input.next();
			PhonebookFunctions.findViaPhoneNumber(phonebookDatabase, phoneNumberFind);
			System.out.print("Enter any key to exit: ");
			String exit3 = input.next();
			break;
		default:
			System.out.print("Try dey enter correct thing once once");
			
		}
		break;
	case 4:
		for(int index = 0; index < phonebookDatabase.size(); index++){
		System.out.printf("%d   %s%n", index+1, phonebookDatabase.get(index)[0]);	
		}
		System.out.print("What contact would you like to edit: ");
		int editSelection = input.nextInt();
		if(editSelection<=phonebookDatabase.size()){
		System.out.print("\n\n1) Edit First Name\n2) Edit Last Name\n3) Edit Phone Number\n\nEnter Choose: ");
		int navi = input.nextInt();
		switch(navi){
			case 1: 
				System.out.print("Enter new first name: ");
				String newFirstName = input.next();
				try{
					PhonebookFunctions.editFirstName(phonebookDatabase, newFirstName, editSelection);
				}
				catch(IndexOutOfBoundsException iobe){
					System.out.print("ERROR. Invalid Contact selection");
				}

				break;

			case 2: 
				System.out.print("Enter new last name: ");
				String newLastName = input.next();
				try{
				PhonebookFunctions.editLastName(phonebookDatabase, newLastName, editSelection);}
				catch(IndexOutOfBoundsException iobe){
					System.out.print("ERROR. Invalid Contact selection");
				}
				break;
			case 3: 
				System.out.print("Enter new phone number: ");
				String newPhoneNumber = input.next();
				try{
				PhonebookFunctions.editPhoneNumber(phonebookDatabase, newPhoneNumber, editSelection);}
				catch(IndexOutOfBoundsException iobe){
					System.out.print("ERROR. Invalid Contact selection");
				}

				break;
			

			default:
				System.out.print("INVALID INPUT");
				break;

			}}
		else{
			System.out.print("INVALID");
		}
		break;


	case 0:
		loopCondition = 1;
		break;
	
	default:
		System.out.print("INVALID INPUT");

	}
	}

}
}
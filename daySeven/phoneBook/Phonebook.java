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
			System.out.print("INVALID INPUT");
		}
		break;

	case 3:
		System.out.print("Enter the first name: ");
		String firstNameFind = input.next();
		PhonebookFunctions.findViaFirstName(phonebookDatabase, firstNameFind);
		break;
	case 0:
		loopCondition = 1;
	
	default:
		System.out.print("INVALID INPUT");

	}
	}

}
}
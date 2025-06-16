const input = require("prompt-sync");
const prompt = input();

const phoneDatabase = [];


let loopCondition = 0;

while(loopCondition == 0){
	console.log("\t\t\tWELCOME TO YRSD PHONEBOOK\n\n1) Add Contact\n2) Remove Contact\n3) Find Contact\n4) Edit Contact\n\n0) Exit");

	const mainMenuNavigator = Number(prompt("Enter your choose: "));

	switch (mainMenuNavigator) {
		case 1:
			let firstName = prompt("Enter the first name: ");
			let lastName = prompt("Enter the last name: ");
			let phoneNumber = prompt("Enter the phone number: ");
			addContact(phoneDatabase,firstName, lastName, phoneNumber);
			break;

		case 2:
			for(let index = 0; index < phoneDatabase.length; index++){
			console.log(`${index+1}) ${phoneDatabase[index][0]}`);
			}
			let selection = Number(prompt("Select the contact: "));
			phoneDatabase.splice(selection-1,1)
			console.log("Contact Removed.");
			break;
		case 3:
			console.log("\n1) Find by First Name \n2) Find by Last Name \n3) Find by Phone Number\n");
			let findChoice = Number(prompt("Enter your move: "));
			switch(findChoice){
				case 1:
					let findFirstName = prompt("Enter your first name: ");
					for(let index = 0; index < phoneDatabase.length; index++){
						if(findFirstName===phoneDatabase[index][0]){
							console.log(`First Name: ${phoneDatabase[index][0]}\n Last Name: ${phoneDatabase[index][1]}\n Phone Number: ${phoneDatabase[index][2]}`)
						}
					}
					break;
				case 2:
					let findLastName = prompt("Enter your last name: ");
					for(let index = 0; index < phoneDatabase.length; index++){
						if(findLastName===phoneDatabase[index][1]){
							console.log(`First Name: ${phoneDatabase[index][0]}\n Last Name: ${phoneDatabase[index][1]}\n Phone Number: ${phoneDatabase[index][2]}`)
						}
					}
					break;
				case 3:
					let findPhoneNumber = prompt("Enter your phone number: ");
					for(let index = 0; index < phoneDatabase.length; index++){
						if(findPhoneNumber===phoneDatabase[index][0]){
							console.log(`First Name: ${phoneDatabase[index][0]}\n Last Name: ${phoneDatabase[index][1]}\n Phone Number: ${phoneDatabase[index][2]}`)
						}
					}
					break;

			
			}
			break;
		case 4:
			for(let index = 0; index < phoneDatabase.length; index++){
			console.log(`${index+1}) ${phoneDatabase[index][0]}`);
			}
			let selectionEdit = Number(prompt("Select the contact: "));
			console.log("\n1)Edit First Name\n2) Edit Last Name\n3)Edit Phone Number\n\n")
			let editChoose = Number(prompt("Select: "));
			switch(editChoose){
				case 1:
					let newFirstName = prompt("Enter new First Name: ");
					phoneDatabase[selectionEdit][0] = newFirstName;
					break;
				case 2:
					let newLastName = prompt("Enter new Last Name: ");
					phoneDatabase[selectionEdit][1] = newLastName;
					break;
				case 3:
					let newPhoneNumber = prompt("Enter phoneNumber: ");
					phoneDatabase[selectionEdit][3] = newPhoneNumber;
					break;

				}

			break;
		case 0:
			loopCondition = 1;
			break;
		default:
			console.log("INVALID OPTION");
	}


}



function addContact(list, firstName, lastName, phoneNumber){
if(phoneNumber.length==11 && phoneNumber.startsWith("0") && lastName.length > 0 && firstName.length > 0){
	const phoneDatabase = [firstName, lastName, phoneNumber];
	list.push(phoneDatabase);
	console.log("\nContact Added.");
	return list;
	}
console.log("\n<<INVALID INPUT>>");
return list;
}

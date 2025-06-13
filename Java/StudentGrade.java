import java.util.Scanner;
public class StudentGrade{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("How many students do you have?");
	int studentSize = input.nextInt();

	System.out.println("How many subjects do they offer?");
	int subjectSize = input.nextInt();
	
	int [][] array = StudentGradeFunctions.saveSubjectAndStudentSize(subjectSize, studentSize);


	for(int counter = 0; counter < array.length; counter++){
		for(int index = 0; index < array.length; index++){
			System.out.printf("Entering score for student %d\n", counter);
			System.out.printf("Enter score for subject %d", index);
			int score = input.nextInt();
			array[counter][index]= score;	
		}
	}	




	}


}
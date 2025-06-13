import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("How many students do you have?");
	int studentSize = input.nextInt();

	System.out.println("How many subjects do they offer?");
	int subjectSize = input.nextInt();
	
	int [][] array = StudentGradeFunctions.saveSubjectAndStudentSize(subjectSize, studentSize);

	int score = 0;
	for(int counter = 0; counter < array.length; counter++){
		for(int index = 0; index < array[0].length; index++){
			System.out.printf("Entering score for student %d\n", counter+1);
			while(true){
			System.out.printf("Enter score for subject %d\n", index+1);
			score = input.nextInt();
			if(score>=0 && score<=100){break;}
			}
			array[counter][index]= score;
		System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		System.out.println("Saved succesfully");	
		}
	}	

	System.out.print(Arrays.deepToString(array));


	}


}
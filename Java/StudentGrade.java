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
					if(score>=0 && score<=100){
						array[counter][index]= score;
						break;
					}
				
			
			}
		System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		
		System.out.println("Saved succesfully\n");	
		}
		System.out.println("=================================================================");
		

	}	

	int [] totalArray = StudentGradeFunctions.getTotalOfScore(array);
	System.out.print("STUDENT		"); 
	for(int index = 0; index < array[0].length; index++){
		System.out.printf("SUB%d	", index+1);
	}
	System.out.println("TOTAL	AVE	POS");
	System.out.println("=================================================================");

	for(int index = 0; index < array.length;index++){
	System.out.printf("Student%d", index+1);
		for(int count = 0; count < array[0].length; count++){
			System.out.printf("	%d",array[index][count]);
		}
	System.out.printf("	%d%n", totalArray[index]);
		
	}

	

	




















	}


}
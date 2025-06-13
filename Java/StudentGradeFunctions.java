import java.util.Scanner;
public class StudentGradeFunctions{
	
	static int[][] saveSubjectAndStudentSize(int numberOfSubjects, int numberOfStudents){
		int[][] array = new int [numberOfStudents][numberOfSubjects];
		return array;
	}


	static int[] getTotalOfScore(int [][] array){
	int [] total = new int[array.length];
	
	for(int index = 0; index <array.length;index++){
		int sum = 0;
		for(int counter=0;counter<array[0].length;counter++){
		sum = sum + array[index][counter];
		}
	 total[index] = sum;
	}
	return total;	
	}






}
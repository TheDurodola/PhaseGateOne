import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class StudentGradeTest{
	
	@Test
	void testSaveNumberOfSubjectsAndStudentsWorks(){
	int numberOfStudents = 4;
	int numberOfSubjects = 6;
	int [][] actual = StudentGradeFunctions.saveSubjectAndStudentSize(numberOfStudents, numberOfSubjects);
	int [][] expected = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
	assertArrayEquals(expected, actual);
	}



	@Test
	void testSaveNumberOfSubjectsAndStudentsWorks(){
	int numberOfStudents = 4;
	int numberOfSubjects = 6;
	int [][] arrayOfDataSize = StudentGradeFunctions.saveSubjectAndStudentSize(numberOfStudents, numberOfSubjects);
	int [][] actual = StudentGradeFunctions.saveSubjectAndStudentSize(numberOfStudents, numberOfSubjects);
	int [][] expected = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
	assertArrayEquals(expected, actual);
	}

}
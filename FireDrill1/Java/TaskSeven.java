public class TaskSeven{
public static void main(String[]args){


for(int index= 1; index < 11; index++){
	int sum = 0;
	if(index%4==0){

		int multiple = index;
		
		for(int count = 0 ; count < 5; count++){
			
			multiple = multiple * index;
			
			
		}	
		sum = sum + multiple;
		
	}
	System.out.printf("%d ", sum);
}



}
}
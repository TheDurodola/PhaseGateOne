public class TaskSix{
public static void main(String[]args){


for(int index= 1; index < 11; index++){
	if(index%4==0){
		int multiple = index;
		for(int count = 0 ; count < 5; count++){
			System.out.printf("%d ", multiple);
		multiple = multiple * index;
		}
	}
}


}
}
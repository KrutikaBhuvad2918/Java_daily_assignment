import java.util.*;

class Program3{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int num;

	System.out.println("Enter 10 numbers : ");

	for(int i = 0; i < 10; i++){
		num = sc.nextInt();
	
	if(num < 0){
		System.out.println("Negative Number Entered, Existing The Loop!");
		break;
	}
     }	
   }
}
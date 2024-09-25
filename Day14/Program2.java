import java.util.*;
class Program2{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers for Swapping: ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	System.out.println("Before Swap: "+ n1 +" "+ n2); 

	int temp = 0;
	{
	  temp = n1;
	  n1 = n2;
	  n2 = temp;

	  System.out.println("After Swap: "+ n1 +" "+ n2);
	}
    }
}

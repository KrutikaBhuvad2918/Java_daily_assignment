import java.util.*;
class Program2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number: ");
	int num = sc.nextInt();
	
	System.out.println("Second Predecessor: "+ (num-2));
	System.out.println("Second Successor: "+ (num+2));
       }
}

	
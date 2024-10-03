import java.util.*;

class Program1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter two numbers for swapping: ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();

	
	System.out.println("Before swap: " + "a = " + n1 +" & " + "b = "+ n2);
	{
	 n1 = n1 + n2;
	 n2 = n1 - n2;
	 n1 = n1 - n2;
	
	System.out.println("After swap: " + "a = " + n1 +" & " + "b = "+ n2);
	}
    }
}

	
import java.util.*;
class Program2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num1: ");
	int n1 = sc.nextInt();

	System.out.println("Enter num2: ");
	int n2 = sc.nextInt();

	int fact = 1;

	for(int i=n1; i<=n2; i++)
	{
	   System.out.println("Factorial of " + i + " = "+ (fact = fact*i));
	}
    }
}
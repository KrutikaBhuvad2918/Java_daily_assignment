import java.util.*;

class Program3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num1 : ");
	int n1 = sc.nextInt();

	System.out.println("Enter num2 : ");
	int n2 = sc.nextInt();

	System.out.println("Quotient : " + (n1/n2));
	System.out.println("Reminder : " + (n1 % n2));
	}
}
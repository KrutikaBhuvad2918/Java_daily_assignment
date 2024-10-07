import java.util.*;

class Program1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int inc = sc.nextInt();
		
	int num = 1;
	for(int i = 0; i < 10; i++) 
	{
	     System.out.print(num + " ");
	     num = num + inc;
	}
    }
}

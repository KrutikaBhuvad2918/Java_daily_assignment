import java.util.*;

class Program1{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
	int num = sc.nextInt();

	System.out.println("Odd Numbers: ");

	for(int i = num; i>=1; i--)
	{
	if(i % 2 == 1)
	{
	  System.out.print(i + " ");
	}
      }
   }
}
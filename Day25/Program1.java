import java.util.*;

class Program1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int count = 0;
	System.out.println("Enter a number: ");
	int num = sc.nextInt();

	for(int i = 1; i<=num; i++)
	{
	 if(num % i == 0)
	 {
	     count++;
	 }
	}
	if(count == 2)
	{
	     System.out.println(num + " is a Prime Number");
	}
	else
	{
	     System.out.println(num + " is a Not Prime Number");
	}
    }
}
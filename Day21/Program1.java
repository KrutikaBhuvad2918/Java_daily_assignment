import java.util.*;

class Program1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number = ");
	int num = sc.nextInt();

	int count = 0;
	
	for(int i = 1; i<=num ; i++)
	{
	 if(num % i == 0)
	 {
	     count++;
	 }
	}
	if(count == 2)
	{
	   System.out.println(num + " is Prime Number");
	}
	else
	{
	   System.out.println(num + " is not Prime Number");
	}
    }
} 
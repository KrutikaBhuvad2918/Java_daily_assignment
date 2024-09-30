import java.util.*;
class Program1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number: ");
	int num = sc.nextInt();

	int sum = 0;
	for(int i = 1; i<num; i++)
	{
	 if(num % i == 0)
	 {
	  sum = sum + i;
	 }
	}
	if(sum == num)
	{
	  System.out.println(num + " is a Perfect number.");
	}
	else
	{
	  System.out.println(num + " is a Not Perfect number.");
	}
    }
}
 

	
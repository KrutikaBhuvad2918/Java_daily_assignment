import java.util.*;

class Program5{
	public static void main(String[] args){
	
	int num, sum;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter num1: ");
	int num1 = sc.nextInt();
	System.out.print("Enter num2: ");
	int num2 = sc.nextInt();
	
	System.out.println("Perfect number between "+ num1 +" to "+ num2 +" is: ");	
	for( num = num1; num<=num2; num++) 
	{
	  sum =  0;
	  for(int i = 1; i<num; i++)
	  {
	     if(num % i == 0)
	     sum = sum + i;
	  }
	  if(sum == num)
		System.out.print(num + " ");
	}
    }
}

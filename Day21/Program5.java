import java.util.*;

class Program5{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter array length = ");
	int len = sc.nextInt();

	int arr[] = new int[len];

	System.out.println("Enter array element = ");
	for(int i = 0; i < len; i++)
	{
	    arr[i] = sc.nextInt();
	}
	int sum = 0;

	for(int i = 0; i < len; i++)
	{
	    sum = sum + arr[i];
	}
	System.out.println("Sum of all array element is = " + sum);
	}
}	
	
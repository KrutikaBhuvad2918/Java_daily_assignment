import java.util.*;

class Program5{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter array size : ");
	int len = sc.nextInt();

	int arr[] = new int[len];

	System.out.println("Enter array elements: ");
	
	for(int i = 0; i<len; i++)
	{
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Array elements in reverse order: ");

	for(int i = len-1; i>=0; i--)
	{
		System.out.println(arr[i]+ "  ");
	}
    }
}
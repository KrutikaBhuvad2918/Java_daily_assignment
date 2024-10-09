import java.util.*;

class Program6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter array length : ");
	int len = sc.nextInt();

	int arr[] = new int[len];

	System.out.println("Enter array element : ");
	for(int i = 0; i < len; i++)
	{
	    arr[i] = sc.nextInt();
	}
	System.out.println("Array element in reverse order : ");
	for(int i = len-1; i >= 0; i--)
	{
	    System.out.println(arr[i]);
	}
    }
}

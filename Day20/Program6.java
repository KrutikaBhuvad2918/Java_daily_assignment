import java.util.*;

class Program6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int min = 0;

	int arr[] = new int[5];

	System.out.println("Enter array elements: ");
	for(int i=0; i<arr.length; i++)
	{
	   arr[i] = sc.nextInt();
	   
	   min = arr[0];
	}
	for(int i=0; i<arr.length; i++)
	{
	 if(min > arr[i])
	 {
	    min = arr[i];
	 }
	}
	System.out.println("Smallest Element = "+ min);
    }
}
	
import java.util.*;

class Program5{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int max = 0;

	int arr[] = new int[5];

	System.out.println("Enter array elements: ");
	for(int i=0; i<arr.length; i++)
	{
	   arr[i] = sc.nextInt();
	   
	   max = arr[0];
	}
	for(int i=0; i<arr.length; i++)
	{
	 if(max < arr[i])
	 {
	    max = arr[i];
	 }
	}
	System.out.println("Largest Element = "+ max);
    }
}
	
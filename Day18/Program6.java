import java.util.*;

class Program6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int arr[] = new int[6];

        System.out.println("Enter Array ELements:");
        for (int i = 0; i < arr.length; i++) 
	{
            arr[i] = sc.nextInt();
        }

	System.out.print("Even Elements: ");
	for (int i = 0; i < arr.length; i++) 
	{
	 if(arr[i]%2 == 0)
	 {
	     System.out.print(arr[i]+", ");
	 }
	}
	System.out.println();

	System.out.print("Odd Elements: ");
	for (int i = 0; i < arr.length; i++) 
	{
	 if(arr[i]%2 == 1)
	 {
	     System.out.print(arr[i]+", ");
	 }
	}
	System.out.println();
	}
}

	

	
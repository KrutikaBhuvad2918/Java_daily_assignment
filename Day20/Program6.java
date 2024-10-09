import java.util.Scanner;

class Program6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements = ");

        for (int i = 0; i < n; i++) 
	{
           arr[i] = sc.nextInt();
        }
	int smallest = arr[0];

        for (int i = 1; i < n; i++) 
	{
        if (arr[i] < smallest) 
	{
            smallest = arr[i];
        }
      }
	System.out.println("The smallest element in the array is = " + smallest);
    }
}

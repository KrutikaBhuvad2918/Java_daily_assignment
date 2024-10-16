import java.util.Scanner;

class Program5{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

		int [] arr = new int[5];
		System.out.println("Enter a numbers : ");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if(i > 0) {
				if(arr[i - 1] > arr[i]) {
				System.out.println("Loop is exited with input "+ arr[i]);
				break;
			}
		  }
	     }
	}
}
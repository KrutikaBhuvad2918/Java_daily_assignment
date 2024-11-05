import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {
	
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while(num >= 0) {
			if(num % 2 == 0) 
				System.out.print(num + "  ");
			num--;
		}
	}
}

		

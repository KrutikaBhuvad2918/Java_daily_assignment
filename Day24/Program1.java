import java.util.*;

class Program1 {
	public static void main(String[] args) {

		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0, b = 1, c;

		System.out.print(a + "  "  + b + "  ");

		for(int i = 0; i < n - 2; i++){
			c = a + b;
			System.out.print(c + "  ");
			a = b;
			b = c;
		}
	}
}
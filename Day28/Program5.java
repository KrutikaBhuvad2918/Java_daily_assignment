import java.util.Scanner;

class Program5 {
	public static void main(String[] args) {
		long num;
		int i = 0;
		System.out.print("Enter num : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextLong();
		while(num != 0) {
			if((num % 10) % 2 == 0)
				i++;
			num = num / 10;
		}
		System.out.println("Number of Even digits : " + i);
	}
}

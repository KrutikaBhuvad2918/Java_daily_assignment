import java.util.Scanner;

class Program5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	long num;
	int i = 0;
	System.out.print("Enter num : ");
	num = sc.nextLong();

		while(num != 0) {
			num = num / 10;
			i++;
		}
		System.out.println("The number has "+ i +" digits.");
	}
}

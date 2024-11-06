import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int temp = num, rem, fact, sum = 0;
		while(temp > 0) {
			rem = temp % 10;
			fact = 1;
			for(int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		if(sum == num)
			System.out.println(num + " is a Strong Number");
		else
			System.out.println(num + " is Not Strong Number");
	}
}

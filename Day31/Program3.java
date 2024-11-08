import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number : ");
		num = sc.nextInt();

		double sum = 0, count = 0;
		while(num!=0) {

			int digit = num % 10;
			sum += digit;
			count++;
			num = num / 10;
		}
		double avg =  sum / count;
		System.out.println("Average is : " + avg);
		}
}
		
		
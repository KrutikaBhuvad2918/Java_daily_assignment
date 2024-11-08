import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		int temp , rem, fact, sum = 0;
		for(int i = 1; i <= num; i++) {
			temp = i;
			sum = 0;
			while(temp > 0) {
				rem = temp % 10;
				fact = 1;
				for(int j = 1; j <= rem; j++) {
					fact *= j;
				}
				sum += fact;
				temp /= 10;
			}
			if(sum == i)
				System.out.print(i + "  ");
		}
	}
}
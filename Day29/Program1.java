import java.util.Scanner;

class Program1 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Deficient numbers up to " + n + ":");

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum < i) {
                System.out.print(i + "  ");
            }
        }
    }
}
import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int num, quo, rem;
		String arr = "";
		System.out.print("Enter Decimal num : ");
		num = sc.nextInt();

		while(true) {
			quo = num / 16;
			rem = num % 16;
			num = quo;
			arr += rem < 10 ? Character.toString((char)(48 + rem)) : Character.toString((char)(55 + rem));
			if(quo == 0)
				break;
		}	

		for(int j = arr.length() - 1 ; j >= 0; j--) {
			System.out.print(arr.charAt(j));
		}
	}
}
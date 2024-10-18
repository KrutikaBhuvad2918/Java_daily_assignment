import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int num, quo, rem;
		String arr = "";

		System.out.println("Enter Decimal Number: ");	
		num = sc.nextInt();

		while(true) {
			quo = num / 8;
			rem = num % 8;
			num = quo;
			arr += Character.toString((char)(48 + rem));
			if(quo == 0)
				break;
		}	
		System.out.println("Octal Number: ");

		for(int j = arr.length() - 1 ; j >= 0; j--) {
			System.out.print(arr.charAt(j));
		}
	}
}
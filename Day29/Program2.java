import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {

		String oct;
		String hex;
		System.out.println("Enter Octal Number : ");
		Scanner sc = new Scanner(System.in);
		oct = sc.next();
		int dec = Integer.parseInt(oct, 8);
		System.out.println("Hexadecimal Number : " + Integer.toHexString(dec));
	}

}

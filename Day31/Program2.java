import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexadecimal Number : ");
		String hex = sc.next();
		int len = hex.length();
		String temp = "";
		String bin = "";
		int h = 0, num, rem, temp_len;
		while(len > 0) {
			num = hex.charAt(h) <= '9' ? hex.charAt(h) - 48 : hex.charAt(h) - 55;
			temp = "";
			while(true) {
				rem = num % 2;
				num /= 2;
				temp += (char)(rem + '0');
				if(num == 0)
					break;
			}
			temp_len = temp.length();
			while(temp_len < 4) {
				temp += '0';
				temp_len++;
			}
			for(int i = 0; i < 4; i++) {
				bin += temp.charAt(3 - i);
			}
			len--;
			h++;
		}
		System.out.println("Binary Number : " + bin);
	}
}
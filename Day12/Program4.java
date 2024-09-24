import java.util.*;

class Program4 {

	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int F_Num = sc.nextInt();

		System.out.print("Enter Second Number : ");
		int S_Num = sc.nextInt();

		System.out.print("Enter the sign of operator: ");
		char sign = sc.next().charAt(0);

		switch(sign) {
		
			case '+': 
				System.out.println("Addition of "+ F_Num + " & " + S_Num + " is "+(F_Num + S_Num));
				break;

			case '-': 
				System.out.println("Subtraction of "+F_Num+" & "+S_Num+" is "+(F_Num>S_Num?F_Num-S_Num:S_Num-F_Num));
                                break;

			case '/': 
				System.out.println("Division of "+F_Num+" & "+S_Num+" is "+(F_Num>S_Num?F_Num/S_Num:S_Num/F_Num));
                                break;

			case '*': 
				System.out.println("Multiplication of "+F_Num+" & "+S_Num+" is "+(F_Num*S_Num));
                                break;

			default: 
				System.out.println("Enter Valid Sign");
		}
	}
}

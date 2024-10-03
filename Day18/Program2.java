import java.util.*;

class Program2{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter mass : ");
	double m = sc.nextDouble();

	System.out.println("Enter velocity : ");
	double v = sc.nextDouble();

	System.out.println(m >= 0 && v >= 0 ? "Kinetic Energy of that Object is = " + m * v * v / 2 : "Enter vali det.");
	}
}
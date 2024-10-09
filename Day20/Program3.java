import java.util.*;

class Program3{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Hours = ");
	int hrs = sc.nextInt();

	if(hrs >= 0)
	{
	   System.out.println("Seconds = " + (hrs * 60 * 60));
	}
	else
	{
	   System.out.println("Enter valid number");
	}
     }
}

import java.util.*;

class Program3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter Distance in (KM): ");
	float dist = sc.nextFloat();
	
	if(dist >= 0) 
	{
	    System.out.println("Distance(m) : " + dist * 1000);
	} 
	else 
	{
	    System.out.println("Not prime.");
	}
    }
}

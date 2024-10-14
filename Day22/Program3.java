import java.util.*;

class Program3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter Distance in Feet = ");
	float feet = sc.nextFloat();
	
	if(feet >= 0) 
	{
	    System.out.println("Distance in (cm) = " + (feet * 30));
	} 
	else 
	{
	    System.out.println("Enter valid det.");
	}
    }
}

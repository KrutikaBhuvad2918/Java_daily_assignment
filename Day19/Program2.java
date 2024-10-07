import java.util.*;

class Program2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter rupees: ");
	float rs = sc.nextFloat();
		
	if(rs >= 0) 
	{
	    System.out.println("Dollar = " + rs / 71.44);
	} 
	else 
	{
	    System.out.println("Enter valild det.");
	}
    }
}

import java.util.*;
class Program2{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter two numbers: ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();

	if(n1<=n2)
	{
	   System.out.print("The Minimum number amongst "+ n1 +" & "+ n2 +" is"+": "+ n1);
	}
	else
	{
	   System.out.print("The Minimum number amongst "+ n1 +" & "+ n2 +" is"+": "+ n2);
	}
    }
}
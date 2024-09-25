import java.util.*;
class Program3{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number:");
	int num = sc.nextInt();

	for(int i=1; i<=num; i++)
	{
	if(i%2==0)
	{
	    System.out.println(("Cube of "+ i +": "+(i*i*i)) +" and "+ (" Square of "+ i +": "+(i*i)));
	}
      }
   }
}
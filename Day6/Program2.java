class Program2{
	public static void main(String args[]){

	int per = 80;
	
	if(per<=59){
	    System.out.println("F grade");
	}
	else if(per>=60 && per<=69){
	    System.out.println("D grade");
	}
	else if(per>=70 && per<=79){
	    System.out.println("C grade");
	}
	else if(per>=80 && per<=89){
	    System.out.println("B grade");
	}
	else if(per>=90 && per<=100){
	    System.out.println("A grade");
	}
	else
	{
	    System.out.println("Invalid input");
	}
     }
}
class Program3{
	public static void main(String args[]){

	int sum ;
	System.out.println("Perfect Numbers: ");
	
	for(int num = 1; num <= 100; num++){

	 sum = 0;

	for(int i = 1; i <= num/2; i++){

		if(num % i == 0){
	    	sum = sum + i;
	  	}
	}
	if(sum == num){
		continue;
	}

	System.out.print(num + "  ");
	}
    }
}
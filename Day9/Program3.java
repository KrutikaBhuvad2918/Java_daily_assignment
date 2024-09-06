class Program3{
	
	public static void main(String args[]){
	
	for(int i=1;i<=4;i++)
	{
	  char ch = 'A';
	  char ch1 = 'a';
	 for(int j=i; j<=4; j++)
	 {
	 if(i%2==1)
	 {
	   System.out.print(ch +"  ");
	   ch++; 
	 }
	else
	 {
	   System.out.print(ch1+"  ");
	   ch1++;
	 }
	}
	System.out.println();
      }
   } 	
}	
class Program4{
	public static void main(String args[]){

	for(int i = 1; i<=4; i++)
	{
	 for(int j = 0; j<=4-i; j++)
	 {
	  if(j%2==1)
	  {
	     System.out.print("=   ");
	  }
	  else
	  {
	     System.out.print("+   ");
	  }
	}
	System.out.println();
      }
   }
}

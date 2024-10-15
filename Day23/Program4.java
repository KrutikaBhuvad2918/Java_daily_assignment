class Program4{

	public static void main(String args[]){

	char inc = 'a';
	for(int i = 4; i >= 0; i--)
	{
	 char ch = inc;
	 for(int j=0; j < i; j++)
	 {
	    System.out.print(ch + "   ");
	    ch++;
	 }
	System.out.println();
	inc += 2;
       }
    }
}
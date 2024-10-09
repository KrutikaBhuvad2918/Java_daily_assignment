class Program4{
	public static void main(String[] args){
		
	for(int i = 0; i < 4; i++) 
	{
	 char ch = (char)('A'+ i);
	   for(int j = i; j < 4 ; j++)
	   {
		System.out.print(ch + "   ");
		ch += 2;
	   }
              System.out.println();
	}
    }
}
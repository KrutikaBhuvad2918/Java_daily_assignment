class Program4{
	public static void main(String args[]){

	for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(j < 3 - i)
					System.out.print("   ");
				else
					System.out.print((i + j) * (i + j) + " "); 
			}
			System.out.println();
		}
	}
}
class Program4{
	public static void main(String args[]){

		for(int i = 0; i < 4; i++) {
			int cnt = 0;
			for(int j = 0; j < 4; j++) {
				if(j < 3 - i) {
					System.out.print("  ");
				}
				else {
					if(cnt == 0)
						System.out.print("= ");
					else 
						System.out.print(cnt + " ");
					cnt++;
				}
			}
			System.out.println();	
		}
	}
}
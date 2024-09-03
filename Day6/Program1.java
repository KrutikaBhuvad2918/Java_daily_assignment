class Program1{
	public static void main(String args[]){
	
	int a = 10, b=20, c=30;
	
	if(a >= b && a <= c) {
            System.out.println(a + " is the third largest");
        } else if(b >= a && b <= c) {
            System.out.println(b + " is the second largest");
        } else {
            System.out.println(c + " is the first largest");
        }
    }
}
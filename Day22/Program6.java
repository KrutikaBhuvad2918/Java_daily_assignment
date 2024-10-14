import java.util.Scanner;

 class Program6{
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        for(int element : arr) {
            if (element == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }  
    }
}

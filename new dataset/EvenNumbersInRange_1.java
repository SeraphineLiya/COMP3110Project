import java.util.Scanner;

public class EvenNumbersInRange {

    public static void main(String[] args)
    {
    	int start;
    	int end;
    	
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a start number: ");
        start = scanner.nextInt();
        System.out.print("Enter an end number: ");
        end = scanner.nextInt();

        for(int i = start; i <= end; i++) {
            if(i%2 == 0) {
                System.out.println("  "+i);
            }
        }
        int difference = end-start;
        System.out.println("Difference = "+difference);
        
        scanner.close();
    }
}
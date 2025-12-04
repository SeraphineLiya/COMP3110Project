import java.util.Scanner;

public class EvenNumbersInRange {

    public static void main(String[] args)
    {
        int end;
    	int start;
    	
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a start number: ");
        start = scanner.nextInt();

        System.out.print("Enter an end number: ");
        end = scanner.nextInt();

        System.out.println("Here are the even numbers between "+start+" and "+end+": ");
        for(int i = start; i <= end; i++) {
            if(i%2 == 0) {
                System.out.println("  "+i);
            }
        }
        
        scanner.close();
    }
}
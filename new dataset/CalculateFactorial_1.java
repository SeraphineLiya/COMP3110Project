import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args)
    {
    	int factorial = 1;
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            factorial = factorial*i;
        }

        System.out.println(n+"! = " + factorial);

        scanner.close();
    }
}

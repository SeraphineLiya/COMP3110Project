import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args)
    {
    	System.out.print("Enter a number: ");
    	
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial = factorial*i;
        }

        System.out.println(n+"! = " + factorial);

        scanner.close();
    }
}
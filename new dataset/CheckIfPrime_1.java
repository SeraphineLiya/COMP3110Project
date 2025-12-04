import java.util.Scanner;

public class CheckIfPrime {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean prime;

        if(num <= 1) {
        	prime = false;
        }

        for(int i = 2; i <= num/2; i++) {
            if(num%i == 0) {
            	prime = false;
                break;
            }
        }

        if(prime) {
            System.out.println(num + " is prime.");
        } 
        else {
            System.out.println(num + " is not prime.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

// Add two numbers
public class myTest {

	public static void main(String[] args) 
	{
	
		// Numbers
		int num1=0;
		int num2=0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);

		// Get numbers from user via keyboard
		System.out.print("Enter num1: ");
		num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter num2: ");
		num2 = scanner.nextInt();
		
		
		// Print sum
		sum = num1+num2;
		System.out.println("Sum = "+sum);
		
		scanner.close();
	
	}

}
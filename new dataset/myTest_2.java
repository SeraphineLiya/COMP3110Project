import java.util.Scanner;

// Add two numbers
public class myTest {

	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);
		
		// Numbers
		int sum=0;
		int num1=0;
		int num2=0;
		
	
		// Get numbers from user via keyboard
		System.out.print("Enter num1: ");
		num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter num2: ");
		num2 = scanner.nextInt();
		
		scanner.close();
		
		// Print sum
		System.out.println("Sum = "+sum);
		sum = num1+num2;
		
	}

}
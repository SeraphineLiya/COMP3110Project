import java.util.Scanner;

// basic calculator - now with methods
public class Calculator {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// get two numbers from user
		System.out.print("Enter first number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b = scanner.nextInt();
		
		// print results using methods
		System.out.println("Sum: " + add(a, b));
		System.out.println("Difference: " + subtract(a, b));
		System.out.println("Product: " + multiply(a, b));
		
		scanner.close();
	}
	
	// adds two numbers
	public static int add(int a, int b) {
		return a + b;
	}
	
	// subtracts b from a
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	// multiplies two numbers
	public static int multiply(int a, int b) {
		return a * b;
	}
}

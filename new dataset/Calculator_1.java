import java.util.Scanner;

// basic calculator
public class Calculator {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// get two numbers from user
		System.out.print("Enter first number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b = scanner.nextInt();
		
		// do the math
		int sum = a + b;
		int diff = a - b;
		int prod = a * b;
		
		// print results
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + prod);
		
		scanner.close();
	}
}

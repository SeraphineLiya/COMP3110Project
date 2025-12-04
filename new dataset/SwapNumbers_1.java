import java.util.Scanner;

// swaps two numbers using temp variable
public class SwapNumbers {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b = scanner.nextInt();
		
		System.out.println("Before: a=" + a + " b=" + b);
		
		// swap using temp
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After: a=" + a + " b=" + b);
		
		scanner.close();
	}
}

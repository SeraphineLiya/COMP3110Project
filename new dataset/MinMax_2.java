import java.util.Scanner;

// finds min and max using Math class
public class MinMax {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// using Math.min and Math.max instead of if statements
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		scanner.close();
	}
}

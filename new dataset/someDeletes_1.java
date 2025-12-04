import java.util.Scanner;

public class SomeDeletes {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Enter x: ");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter y: ");
		int y = scanner.nextInt();

		doCalcs(x,y);
		
		scanner.close();
	}
	
	public static void doCalcs(int x, int y)
	{
		// Calculate and store results
		int a = x*y;
		int b = y*x;
		int c = x/y;
		int d = y/x;
	
		// Strings to print
		String XtimesY = ("x * y = ");
		String YtimesX = ("y * x = ");
		String XdividedByY = ("x / y = ");
		String YdividedByX = ("y / x = ");
		
		// Print results
		System.out.println(XtimesY + a);
		System.out.println(YtimesX + b);
		System.out.println(XdividedByY + c);
		System.out.println(YdividedByX + d);
	}
	
}
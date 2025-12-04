import java.util.Scanner;

// finds min and max of three numbers
public class MinMax {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// find min using if statements
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		// find max using if statements
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		scanner.close();
	}
}

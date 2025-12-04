import java.util.Scanner;

// simple greeting program with user input
public class Greeting {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Hello, " + name + "!");
		System.out.println("Welcome to Java.");
		System.out.println("Goodbye!");
		
		scanner.close();
	}
}

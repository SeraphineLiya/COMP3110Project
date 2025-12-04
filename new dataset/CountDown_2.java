import java.util.Scanner;

// countdown program - now with user input
public class CountDown {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int start = scanner.nextInt();
		
		System.out.println("Counting down:");
		for(int i = start; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("Blast off!");
		scanner.close();
	}
}

import java.util.Scanner;

// prints a star pattern - user chooses rows
public class PrintPattern {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many rows? ");
		int rows = scanner.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}

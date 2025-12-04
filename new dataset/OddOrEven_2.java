import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args)
	{
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num%2!=0) {
			System.out.println("That is an odd number");
		}
		if(num%2==0) {
			System.out.println("That is an even number");
		}
		
		System.out.println("Thank you!");
		scanner.close();
	}
}
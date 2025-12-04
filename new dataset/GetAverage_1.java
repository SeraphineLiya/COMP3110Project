import java.util.Scanner;

public class GetAverage{

	public static void main(String[] args) 
	{
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);		// Scanner scanner = new Scanner(System.in);
		int length = input.nextInt(); 				// int length = scanner.nextInt();
		int sum=0;
		
		System.out.println("Enter "+length+" integers to find the average of: ");		
		for(int i=0; i<length; i++) {
			sum+=input.nextInt();					// sum+=scanner.nextInt();
		}
		
		System.out.printf("Average = %.2f\n",(((float)sum/length)));
		System.out.println("Sum = "+sum);
		
		input.close();
	}
	
}
import java.util.Scanner;

// program to sum up array elements
public class SumArray {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		// get the numbers
		for(int i=0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// add them up
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum = " + sum);
		scanner.close();
	}
}

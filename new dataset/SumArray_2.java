import java.util.Scanner;

// program to sum up array elements
// also added max min and average
public class SumArray {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " integers:");
		// get the numbers
		for(int i=0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// add them up and find max/min
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<size; i++) {
			sum += arr[i];
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		double average = (double)sum / size;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		scanner.close();
	}
}

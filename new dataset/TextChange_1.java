import java.util.Scanner;

public class TextChange {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		float c;
		
		System.out.print("Enter num1: ");
		a = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter num2: ");
		b = scanner.nextInt();
		
		System.out.println("a + b = "+addNum(a,b));
		System.out.println("a - b = "+subtractNum(a,b));
		System.out.println("a * b = "+multiplyNum(a,b));
		System.out.println("a / b = "+divideNum(a,b));
		scanner.close()
	}
	
	public static int addNum(int a, int b) {
		return a+b;
	}
	
	public static int subtractNum(int a, int b) {
		return a-b;
	}
	
	public static int multiplyNum(int a, int b) {
		return a*b;
	}
	
	public static int divideNum(int a, int b) {
		return a-b;
	}
	
}
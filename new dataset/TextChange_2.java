import java.util.Scanner;

public class TextChange {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		
		
		System.out.print("Enter a: ");
		a = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter b: ");
		b = scanner.nextInt();
		
		System.out.println("a + b = "+addNum(a,b));
		System.out.println("a - b = "+subNum(a,b));
		System.out.println("a * b = "+multNum(a,b));
		System.out.println("a / b = "+divNum(a,b));
		scanner.close()
	}
	
	public static int multNum(int a, int b) {
		return a*b;
	}
	
	public static int divNum(int a, int b) {
		return a/b;
	}
	
	public static int addNum(int a, int b) {
		return a+b;
	}
	
	public static int subNum(int a, int b) {
		return a-b;
	}
	
}
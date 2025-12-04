import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		System.out.print("Please enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		System.out.print("In reverse, your string is: ");
		System.out.print(reverseString(str));
		
		scanner.close();
	}
	
	public static String reverseString(String str)
	{
		char[] strReverse = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			strReverse[(str.length()-1)-i] = str.charAt(i); 
		}
		
		String reversed = new String(strReverse);
		return reversed;
	}
}
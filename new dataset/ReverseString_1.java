import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		System.out.print("Please enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		char[] strReverse = new char[str.length()];

		for(int i=0; i<str.length(); i++) {
			strReverse[(str.length()-1)-i] = str.charAt(i);
		}

		System.out.print("In reverse, your string is: ");
		System.out.print(strReverse);

		scanner.close();
	}
}
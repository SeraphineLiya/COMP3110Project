import java.util.Scanner;

// Examples of Strings
public class Strings {
	public static void main(String[] args)
	{
		String oneLine = ("This string has one line");
		String twoLines = ("(1) This string has \n(2)two lines");
		String tabString = ("This\tstring\tuses\ttabs");
				
		int strInt=4;
		String varTest = ("This string contains the value of a variable: i = "+strInt);
		
		System.out.println(oneLine);
		System.out.println(twoLines);
		System.out.println(tabString);
		System.out.println(varTest);

		String prompt = ("Enter your own string: ");
		System.out.println(prompt);
		
		Scanner scanner = new Scanner(System.in);
		String userString = scanner.nextLine();
		System.out.println("Your string was: "+userString);
		
		String uppercase = "In uppercase: "+userString.toUpperCase();
		String lowercase = "In lowercase: "+userString.toLowerCase();
		
		System.out.println(lowercase);
		System.out.println(uppercase);
		int userStrLength = userString.length();
		String strLength = ("Your string was " + userStrLength +" chars long");
		System.out.println(strLength);
		
		scanner.close();
	}
}
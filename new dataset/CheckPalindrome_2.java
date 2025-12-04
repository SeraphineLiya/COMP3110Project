import java.util.Scanner;

public class CheckPalindrome{

	public static void main(String[] args) 
	{

		System.out.print("Please enter a string to see if it's a palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			
			if(i==str.length()-1) {
				if(str.charAt(i)!=str.charAt((str.length()-1)-i)) {
					System.out.println("Not a palindrome");
				}
				else {
					System.out.println("Palindrome");
				}
			}
			
		}
		
		scanner.close();
	}
	
}
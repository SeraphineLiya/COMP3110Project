import java.util.Scanner;

public class CountConsonantsAndVowels{

	public static void main(String[] args) 
	{

		System.out.print("Please enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();	
		
		int numVows=0;
		int numCons=0;
		int numNonLetters=0;
				
		char ch;
		
		for(int i=0; i<str.length(); i++) {
			ch = (str.toLowerCase()).charAt(i);
		
			if(ch>96 && ch<123) {		
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					numVows++;
				}
				else {
					numCons++;
				}	
			}
			else {
				numNonLetters++;
			}
		}
		
		System.out.println("Number of vowels: "+numVows);
		System.out.println("Number of consonants: "+numCons);
		System.out.println("Number of non-letters: "+numNonLetters);
		
		scanner.close();
	}
	
}
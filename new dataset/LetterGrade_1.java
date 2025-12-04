import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int numberGrade = -1;
		
		System.out.print("Enter an integer grade: ");
		numberGrade = scanner.nextInt();
		
		if(numberGrade>=80) {
			System.out.println("That is in the A range");
		}
		else if(numberGrade>=70) {
			System.out.println("That is in the B range");
		}
		else if(numberGrade>=60) {
			System.out.println("That is in the C range");
		}
		else if(numberGrade>=50) {
			System.out.println("That is in the D range");
		}
		else {
			System.out.println("That is in the F range");
		}
		
		scanner.close();
	}

}
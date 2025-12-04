import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int numberGrade = -1;
		char letterGrade;
		
		System.out.print("Enter an integer grade: ");
		numberGrade = scanner.nextInt();
		
		if(numberGrade>=80) {
			letterGrade='A';
		}
		else if(numberGrade>=70) {
			letterGrade='B';
		}
		else if(numberGrade>=60) {
			letterGrade='C';
		}
		else if(numberGrade>=50) {
			letterGrade='D';
		}
		else {
			letterGrade='F';
		}
		
		System.out.println("That is in the "+letterGrade+" range");
		scanner.close();
	}

}
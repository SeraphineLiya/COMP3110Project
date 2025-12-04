import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

        	int randomNumber = random.nextInt(100) + 1;
		int guess = -1;
		
		for(int i=1; guess!=randomNumber; i++)
		{
			System.out.print("Guess a number between 1 and 100: ");
			guess = scanner.nextInt();

			if(guess<randomNumber) {
				System.out.println("Try guessing a higher number!\n");
			}
	
			if(guess>randomNumber) {
				System.out.println("Try guessing a lower number!\n");
			}

			if(guess==randomNumber) {
				System.out.println("You guess the number in "+i+" attempts!\n");
			}

		}

		System.out.println("Thanks for playing!");
		scanner.close();
	}
}

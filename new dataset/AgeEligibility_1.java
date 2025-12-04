import java.util.Scanner;

public class AgeEligibility {
	
	public static void main(String[] args) 
	{
		System.out.print("Please enter a person's age in years: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if(age<16) {
			System.out.println("A person this age cannot get a driver's licence");
		}
		else {
			System.out.println("A person this age can get a driver's licence");
		}
		
		if(age<18) {
			System.out.println("A person this age cannot vote");
		}
		else {
			System.out.println("A person this age can vote");
		}	
		
		if(age<19) {
			System.out.println("A person this age cannot purchase cigarettes");
		}
		else {
			System.out.println("A person this age can purchase cigarettes");
		}	
						
		scanner.close();
		System.out.println("Thank you!");
	}
	
}
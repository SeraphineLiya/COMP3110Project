import java.util.Scanner;

public class AgeEligibility {
	
	public static void main(String[] args) 
	{
		System.out.print("Please enter a person's age in years: ");
		Scanner scanner = new Scanner(System.in);
		int ageOfPerson = scanner.nextInt();

		if(ageOfPerson<16) {
			System.out.println("Someone this age cannot get a driver's licence");
		}
		else {
			System.out.println("Someone this age can get a driver's licence");
		}
		
		if(ageOfPerson<18) {
			System.out.println("Someone this age cannot vote");
		}
		else {
			System.out.println("Someone this age can vote");
		}	
		
		if(ageOfPerson<19) {
			System.out.println("Someone this age cannot purchase cigarettes");
		}
		else {
			System.out.println("Someone this age can purchase cigarettes");
		}	
				
		scanner.close();
	}
	
}
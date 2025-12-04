import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args)
    {
    	double tempF;
    	double tempC;
        
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Enter a temperature in Celsius: ");
        tempC = scanner.nextDouble();
        tempF = (tempC * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f",tempF);
    	
        System.out.print("\n\nEnter a temperature in Fahrenheit: ");
        tempF = scanner.nextDouble();
        tempC = (tempF - 32)*(5.0/9.0);
        System.out.printf("Temperature in Celsius: %.2f", tempC);
        
        scanner.close();
    }
}
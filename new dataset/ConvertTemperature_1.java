import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args)
    {
        double tempC;
        double tempF;
        
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Enter a temperature in Celsius: ");
        tempC = scanner.nextDouble();
        tempF = (tempC * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f",tempF);

        scanner.close();
    }
}
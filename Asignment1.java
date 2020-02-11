import java.util.Scanner;

public class Asignment1 {
	public static void main(String[] args) {
		final double Num1 = 35.74, Num2= 0.6215, Num3 = 35.75, Num4 = 0.4275, Num5 = 0.16;
		double num6, windChill;
		
		String myName = "Anh Tu Pham";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wind Chill Callculator\n");
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		double tempFah = scanner.nextDouble();
		System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
		double windSpeed = scanner.nextDouble();
		num6 = Math.pow(windSpeed, Num5);
		windChill = Num1 + Num2*tempFah + (- Num3*num6) + Num4*tempFah*num6;
		System.out.println("\nWind chill Temperature: " + windChill + " degrees Fahrenheit");
		System.out.println("\nProgrammer: " + myName);
		
	}
}
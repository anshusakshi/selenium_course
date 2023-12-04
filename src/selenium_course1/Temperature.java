package selenium_course1;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the celsius Value");
		double value = scan.nextDouble();
		double Farn, kelvin;
		Farn = 1.8*value + 32;
		kelvin = value+273;
		System.out.println(value+" Celsius = " + Farn+ " Fahrenheit");
		System.out.println(value+" Celsius = " + kelvin+ " Kelvin");


	}

}

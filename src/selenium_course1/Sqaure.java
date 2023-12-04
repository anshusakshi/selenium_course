package selenium_course1;

import java.util.Scanner;

public class Sqaure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Number");
		double i= scan.nextDouble();
		System.out.println("Sqaure: "+ (i*i));
		System.out.println("Cube: "+ (i*i*i));
		System.out.println("fourth power: "+ (i*i*i*i));
		

	}

}

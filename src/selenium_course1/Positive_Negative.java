package selenium_course1;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner cde = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int num =cde.nextInt();
		if(num>=0) {
			System.out.println("Number is positive"); 
		}
		else {
			System.out.println("Number is Negative");
		}
		

	}

}

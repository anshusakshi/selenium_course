package selenium_course1;

import java.util.Scanner;

public class Maximum_num {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System .out.println("Please enter three numbers");
		System.out.println("Enter Your First number");
		int num1=abc.nextInt();
		System.out.println("Enter your second number");
		int num2=abc.nextInt();
		System.out.println("Enter your last numnber");
		int num3=abc.nextInt();
		
		if(num1>=num2&&num1>=num3) {
			System.out.println(num1+" is the greatest");
		}
		else if (num2>=num1&&num2>=num3) {
			System.out.println(num2+" is the greatest");
		}
		else {
			System.out.println(num3+" is the greatest");
			
		}
		
		

	}

}

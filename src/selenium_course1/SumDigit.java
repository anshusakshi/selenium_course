 package selenium_course1;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		int a, add = 0;
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		 int b=num1;
		while(num1>0) {
			a=num1%10;
			add=add+a;
			num1=num1/10;
			
		}
		
		System.out.print(add);
	}

}

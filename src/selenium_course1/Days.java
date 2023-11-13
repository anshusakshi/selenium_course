package selenium_course1;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number from 1 to 7 :-");
	int value = scan.nextInt();
	if(value==1) {
		System.out.println("Monday");
	}
	else if(value==2) {
		System.out.println("Tueday");
		}
	else if(value==3) {
		System.out.println("Wednesday");
		}
	else if(value==4) {
		System.out.println("Thursday");
	}
	else if (value==5) {
		System.out.println("Friday");
	}
	else if(value==6) {
		System.out.println("Saturday");
	}
		else if(value==7) {
			System.out.println("Sunday");
		}
	else{
		System.out.println("Invalid number");
		}
	}
	}


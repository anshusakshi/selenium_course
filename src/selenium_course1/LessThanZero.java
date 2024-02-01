package selenium_course1;

import java.util.Scanner;

public class LessThanZero {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		{
		while(value>0) 
		{
			if (value<0) 
			{
				break;
			}
			System.out.println(value + " is greater than 0");
			}
			
	}

}
}


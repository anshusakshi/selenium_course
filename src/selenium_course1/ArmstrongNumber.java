package selenium_course1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int count=0, sum=0,a,b,c;
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num1 =scan.nextInt();
		a=num1;
		c=num1;
		while(a>0) {    // This while loop is used to get the total digit of user input.
			a=a/10;
			count++;
		}
		while(num1>0) { //This while loop is used to fetch the last digit from user input and then make sum of it.
			b=num1%10;
			sum= (int) (sum+ Math.pow(b,count));
			num1=num1/10;
			 
		}
if(sum==c)
	System.out.println(c +" is a armstrong number");
else
	System.out.println(c +" not a Armstrong number");
}
}


package selenium_course1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num;
		int var1=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 =scan.nextInt();
		while(num1!=0){
			num=num1%10;
			var1=var1*10+num;
			num1=num1/10;
			
		}
		 			
			System.out.println(var1);
			

	}

}

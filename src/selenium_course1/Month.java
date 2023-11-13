package selenium_course1;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner cde = new Scanner(System.in);
		System.out.println("Please enter month value from 1 to 12, to find number of days in a month");
		int mon = cde.nextInt();
		if(mon==1){
			System.out.println("January is having 31 days");
		}
		else if(mon==2) {
			System.out.println("Feb is having 28 or 29 days");
		}
		else if (mon==3) {
			System.out.println("March is having 31 days");
		}
		else if (mon==4) {
			System.out.println("April is having 30 days");
		}
		else if(mon==5) {
			System.out.println("May is having 31 days");
		}
		else if(mon==6) {
			System.out.println("June is having 30 days");
		}
		else if(mon==7) {
			System.out.println("July is having 31 days");
		}
		else if(mon==8) {
			System.out.println("August is having 31 days");
		}
		else if(mon==9) {
			System.out.println("Sept is having 30 days");
		}
		else if(mon==10) {
			System.out.println("Oct is having 31 days");
		}
		else if(mon==11) {
			System.out.println("Nov is having 30 days");
		}
		else if(mon==12) {
			System.out.println("Dec is having 31 days");
		}
		else {
			System.out.println("Invalid number");
		}
			
			}

}

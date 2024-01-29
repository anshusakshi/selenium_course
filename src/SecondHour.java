import java.util.Scanner;

public class SecondHour {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		int hr,min,sec;
		hr = value/ 3600;
		min = (value % 3600) / 60;
		sec = value % 60; 
		System.out.println(hr +" hours "+ min+" minutes " + sec +" seconds ");
		
		
	}

}

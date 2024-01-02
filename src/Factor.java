import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		System.out.println("Enter Number to get factor");
		Scanner scan = new Scanner(System.in);
		int num1 =scan.nextInt();
	
int i;
for(i=1;i<num1;i++) {
	if(num1%i==0) {
		System.out.print(i+" ");
	}
}
	}

}

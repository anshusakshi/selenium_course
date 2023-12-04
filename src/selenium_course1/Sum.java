package selenium_course1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter First Integer");
   double Value1 = scan.nextDouble();
   System.out.println("Enter Second Integer");
   double Value2= scan.nextDouble();
   System.out.println("Sum : "+ (Value1+Value2));
  System.out.println("Difference : " + (Value1 - Value2));
   System.out.println("Product : " + (Value1*Value2));
   System.out.println("Average : " +(Value1+Value2)/2);
   System.out.println("Distance: "+ (Value1 - Value2));
   if (Value1>Value2) {
	   System.out.println(Value1 + " is the maximum number");
   }
   
   else
	   System.out.println(Value2 + " is the maximum number");
   
   
   if (Value1<Value2){
   
   System.out.println(Value1 + " is the minimum number");
   }
   else
	   System.out.println(Value2 + " is the minimum number");
 
   
		   
	}
	

}

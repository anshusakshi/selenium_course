package selenium_course1;

public class Fibonacci {

	public static void main(String[] args) {
		int Count=10,V1=0,V2=1,V3;
		System.out.print(V2+" ");
		for(int i=1;i<=Count;i++) {
			V3=V1+V2;
		    V1=V2;
		    V2=V3;
		    System.out.print(V3+" ");
	}
		
		}
		

	}



package selenium_course1;

public class Fibonacci {

	public static void main(String[] args) {
		int Count=10,v1=0,v2=1,v3;
		System.out.print(v2+" ");
		for(int i=1;i<=Count;i++) {
			v3=v1+v2;
		    v1=v2;
		    v2=v3;
		    System.out.print(v3+" ");
	}
		
		}
		

	}



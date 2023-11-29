package selenium_course1;

public class Pattern7 {

	public static void main(String[] args) {
		int i,j,k,l;
		for(i=1;i<=5;i++) 
		{
			for(j=4;j>=i;j--) 
				{
					System.out.print(" ");
				}
				for(k=2;k<=i;k++)
				{
					System.out.print("*");
				}
		
                 for(l=1;l<=i;l++)

                   {
                	 System.out.print("*");
                   }
                 System.out.println("");

		}
		for(i=1;i<=5;i++)
		{
			for(j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=4;k>=i;k--) {
				System.out.print("*");
			}
			for(l=5;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}


	}


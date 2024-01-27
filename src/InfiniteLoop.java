
public class InfiniteLoop {

	public static void main(String[] args) {
		int i,j=0;
		for(i=1;i>=j;i++) {
			System.out.println(i);
		}

	}
}

 class InfiniteLoop2 {

	public static void main(String[] args) {
		

				
					int i,j=0;
					for(i=1;i>=j;i++) {
						for(j=i;j<=i;j++)
						System.out.println(i);
					}
				}
			 	

	}
 class InfiniteLoop3 {

	public static void main(String[] args) {
		int i,j=0,k;
		for(i=1;i>=j;i++) {
			for(j=1;j>=i;j++) {
				for(k=1;k>=i;k++)
				{
					System.out.println(i);
				}
			}
		}

	}

}

 
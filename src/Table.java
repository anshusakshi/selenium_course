
public class Table {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=20;i++) {
			for(j=1;j<=10;j++) {
				if(i==6 || i==12 || i==17) {
					continue;

				}
				System.out.print(i*j+ " ");
			}
			System.out.println();
		}



	}

}

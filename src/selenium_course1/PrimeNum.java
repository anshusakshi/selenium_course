package selenium_course1;

public class PrimeNum {

	public static void main(String[] args) {
		int i,j,chk; 
		for(i=2;i<20;i++)
		{
		chk=0;
			for (j=2;j<i;j++) {
				if(i%j==0)
				{
					chk++;
					break;
				}
			}
			if(chk==0)
				System.out.println(i);
			}
	}
}



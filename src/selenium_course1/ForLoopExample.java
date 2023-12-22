package selenium_course1;

public class forLoopExample {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++) 
		{
			if(i%3==0) 
			{
			System.out.println("Divisle by 3: "+ i);
			}
					else if(i%5==0 )
					{
			System.out.println("Divisle by 5: "+ i);
			}
		
			else if(i%3==0 && i%5==0)
			{
			System.out.println("Divisle by 3 and 5: "+ i);
			}
			else {
				System.out.println();
			
			}
			}
			}	
			}

	



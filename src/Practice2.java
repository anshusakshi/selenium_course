class Practice2
{
	public static void main(String[] args) {
		Practice P1= new Practice();
	int k = P1.add(P1.add(10,20),P1.add(30,40));
	System.out.println(k);
	}
} 

class Practice {

	public int add(int i,int j) {
		return i+j;
		
	}

}	
// i will get the sum of all the numbers i=10+20,j=30+40
// in return i am doing i+j means 30+70=100

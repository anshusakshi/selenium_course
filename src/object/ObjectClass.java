package object;

public class ObjectClass {

	public static void main(String[] args) {
	Human h1=new Human();
		 h1.name = "Sakshi";
		 h1.age=35;
		 h1.country="India";
		 h1.speak("Hi");
		 System.out.println(h1.name);
		 
		 
		 
		 
		 Bag b1=new Bag();
			b1.brand="wildcraft";
			b1.zip=5;
			b1.carry("Books");
			System.out.println(b1.zip);
			System.out.println(h1.country);
			
			
			Bed E1=new Bed();
			E1.shape="Sqaure";
			E1.length=8.5;
			E1.tosleep("Peacefully");
			System.out.println(E1.length);
			System.out.println(E1.shape);
			
			
			Fan F1 =new Fan();
			F1.bladeCount=3;
			F1.air(null);
			System.out.println(F1.bladeCount);
            System.out.println(b1.brand);
            
            notebook N1=new notebook();
            N1.page=100;
            N1.shape="Rectangle";
            N1.towrite("notes");
            System.out.println(N1.shape);
            System.out.println(E1.shape);
            
            table T1=new table();
            T1.tableleg=4;
            T1.shape="Sqaure";
            T1.length=15.3;
            T1.tokeep(null);
            System.out.println(T1.shape);
            System.out.println(T1.tableleg);
            
            laptop L1=new laptop();
            L1.brand="Lenovo";
            L1.processsor=458;
            L1.toWork(null);
            System.out.println(L1.brand);
            
            
            bottle C1= new bottle();
            C1.color="blue";
            C1.material="Plastic";
            C1.size=1;
            System.out.println(C1.color);
            System.out.println(C1.material);
            C1.carryWater(null);
            
            
            sofa S1=new sofa();
            S1.color= "Blue";
            S1.material="Lether";
            System.out.println(S1.material);
            S1.toseat(null);
            
            door D1=new door();
            D1.shape= "Rectangle";
            D1.size=5;
            D1.tolock(null);
            System.out.println(D1.shape);
            System.out.println(D1.size);
            
            
            
            
           }
	

}


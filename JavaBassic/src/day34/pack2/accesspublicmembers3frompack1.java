package day34.pack2;



public class accesspublicmembers3frompack1 {

	public static void main(String[] args) {
		day34.pack1.publicmembers3 l1=new day34.pack1.publicmembers3();
		// TODO Auto-generated method stub
		
		System.out.println(l1.load);
		l1.display();
	}
}
class demo{
	public static void main(String[] args) {
		day34.pack1.publicmembers3 l1=new day34.pack1.publicmembers3();
		// TODO Auto-generated method stub
		
		System.out.println(l1.load);
		l1.display();
	
	}
}
//if i am not using import statement then i have to use fullyqualified classname everytime
//we can access public members outside the package only the condition is that class is required as declared as public 
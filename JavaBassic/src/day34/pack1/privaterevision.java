package day34.pack1;

public class privaterevision {
	private int load=90;
	private static void display() {
		System.out.println("private method which is accessed within class only");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privaterevision n1= new privaterevision();
		System.out.println(n1.load);
		display();
		}

}
class another{
	public static void main(String[] args) {
		privaterevision n1= new privaterevision();
		/*
		System.out.println(n1.load);
		display();	
		*/
		
	}
}
package day34.pack1;

public class publicmembers3 {
	public int load=88;
	public void display() {
		System.out.println("nonstatic publiic method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicmembers3 l1=new publicmembers3 ();
		System.out.println(l1.load);
		l1.display();
	}
}
class anotherclass{
	public static void main(String[] args) {
		publicmembers3 l1=new publicmembers3 ();
		System.out.println(l1.load);
		l1.display();
	
	}
}
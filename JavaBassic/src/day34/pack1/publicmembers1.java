package day34.pack1;

public class publicmembers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicmembers n1=new publicmembers();
		System.out.println("accessing public members in same source file but in different class");
		System.out.println(n1.hotspot);
		System.out.println(n1.five);
		n1.test();
	}

}
class childclass{
	public static void main(String[] args) {
		publicmembers n1=new publicmembers();
		System.out.println("accessing public members in same source file but in different class");
		System.out.println(n1.hotspot);
		System.out.println(n1.five);
		n1.test();
	}
}
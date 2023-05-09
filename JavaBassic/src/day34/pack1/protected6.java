package day34.pack1;

public class protected6 {
	protected double salary=45;
	protected int relay() {
		System.out.println("nonstatic protected method of class protected6");
		return 12;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protected6 m1=new protected6();
		System.out.println("accessing protected members in same class :"+m1.salary);
		m1.relay();	
	}
}
class geeta{
	public static void main(String[] args) {
		protected6 m1=new protected6();
		System.out.println("accessing protected members in another class of same source file :"+m1.salary);
		m1.relay();	
	}
}

package day34.pack1;

public class protectedrevision {
	protected float salary=88;
	protected int relay() {
		System.out.println("protected method of class");
		return 7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectedrevision n1=new protectedrevision();
		System.out.println(n1.salary);
		n1.relay();
	}
}
class another9{
	public static void main(String[] args) {
		protectedrevision n1=new protectedrevision();
		System.out.println(n1.salary);
		n1.relay();	
	}
}
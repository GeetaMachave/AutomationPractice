package predefinedclassobjectclass;
class demo123{
	void display() {
		System.out.println("i am display() of class demo123");
	}
	
}
public class exp3 extends  demo123{
	void display() {

		System.out.println("overrided method of class demo123");
	}
	public int hashcode() {
		return 505;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo123 k1=new demo123();
		System.out.println(k1);
		exp3 b1=new exp3();
		System.out.println(b1);//internally java compiler call tostring method
		System.out.println(b1.toString());
		System.out.println(b1.hashCode());
		b1.hashcode();
		demo123 p1=new demo123();
		System.out.println(p1);
		
		demo123 n1=new exp3();
		System.out.println(n1);
		System.out.println(n1.toString());
		System.out.println(n1.hashCode());
		n1.hashCode();
		
			}

}

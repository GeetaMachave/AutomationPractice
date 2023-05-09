package predefinedclassobjectclass;
class sunita{
	public int hashCode() {
		return 100;
	}
	public String toString() {
		return "overrided String Method";
	}
}
public class exp6 extends sunita{
	static int rollno=89;
	int roll;
	exp6(){
		roll=rollno;
		rollno++;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp6 n1=new exp6();
		System.out.println(n1);
		System.out.println(n1.hashCode());
		exp6 m1=new exp6();
		System.out.println(m1);
		System.out.println(m1.hashCode());
		System.out.println("compare n1&m1"+n1.equals(m1));
		exp6 b1=m1;
		System.out.println(b1.equals(m1));
		sunita e1=new sunita();
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
	}

}

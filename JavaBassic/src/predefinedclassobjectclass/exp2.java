package predefinedclassobjectclass;
class demo {
	void display() {
		System.out.println("i am display method of demo class ");
	}
	
	
}
public class exp2 extends demo{
	static int last_roll=100;
	int roll_no;
	exp2(){
		roll_no=last_roll;
		last_roll++;
	}
	void dispaly() {
		System.out.println("overrided method of class demo in class exp2");
	}
	public int hashcode() {
		return 505;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new demo());
		demo g1=new exp2();
		System.out.println(g1);
		g1.display();
		System.out.println(g1.hashCode());
		
	}

}

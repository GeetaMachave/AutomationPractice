package holerevision;
class A{
	A(int u){
		this(12.4);
		System.out.println("hello class A");
	}
	A(double d){
	System.out.println("calling current class constructor using this statement");	
	}
	int age;
	static void relay() {
		System.out.println("static methods cannot be partici[ated in inheritance if we want to call static methods we need to call with standard i.e.classname");
	}
}
class B extends A{
	B(float h){
		super(1);
		System.out.println("constructor chaining using super statement");
	}
	void result() {
		System.out.println("nonstatic method of class B");
	}
}

class X extends B{
	X(){
	super(12.3f);	
	}
	int local=12;
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	X k1=new X();
	
}
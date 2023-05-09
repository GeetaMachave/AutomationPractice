package revision;
class module{
	static int age=10;
	double rule=89.23;
	 static void delay() {
		System.out.println("nonstatic method of superclass/parent class/base class module");
	}
	
}

public class inheritance4 extends module {
	int age=55;
	double rule=88;
	static void delay() {
		System.out.println("nonstatic method of subclass/child class/derived class");
	}
void dotts(double d) {
	this.rule=d;
	System.out.println("value of rule using this keyword"+rule);
	}
void result() {
	super.delay();
	delay();
	System.out.println(super.age);
	System.out.println(age);
	System.out.println(rule);
	System.out.println(super.rule);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance4 t1=new inheritance4();
		System.out.println("program starts");
		t1.result();
		

	}

}

package day34.pack1;

public class defaultrevision {
	int age=90;
	void test() {
		System.out.println("default method");
	}
	static double rename=88;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultrevision j1= new defaultrevision();
		System.out.println(j1.age);
		j1.test();
		System.out.println(defaultrevision.rename);
	}
}
class another1{
	public static void main(String[] args ) {
		defaultrevision j1= new defaultrevision();
		System.out.println(j1.age);
		j1.test();
	
		
	}
}
package inheritance;
class A1{
	static int  e=6;
	int f=4;
	double g=6;
	
	void test() {
		System.out.println("nonstatic method of class A");
	}
}
class B1 extends A1{
	static int w;
	int y =90;
	float z=5;
	static void method() {
		System.out.println("static method of class B");
	}
	void result() {
		System.out.println("nonstatic method of class B");
	}
	class C1 extends B1{
		static int p=56;
		int q=98;
		double r=66;
		static void output() {
			System.out.println("static method of class C");
		}
		
		void diagram() {
			System.out.println("non static method of class C");
		}
	}
	
}
public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("accessing static member of class A1");
		System.out.println(A1.e);
		System.out.println("accessing static members of class B1");
		System.out.println(B1.w);
		B1.method();
		System.out.println("acceessing static members of class C1");
		B1 t1=new B1();
		System.out.println(t1.y);
		System.out.println(t1.z);
		t1.result();
		
		
	}
}

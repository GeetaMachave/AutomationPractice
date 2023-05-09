package inheritance;
class A{
	static int  e=6;
	int f=4;
	double g=6;
	
	void test() {
		System.out.println("nonstatic method of class A");
	}
}
class B{
	static int w;
	int y =90;
	float z=5;
	static void method() {
		System.out.println("static method of class B");
	}
	void result() {
		System.out.println("nonstatic method of class B");
	}
	class c{
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
public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("accessing static member of class A");
System.out.println(A.e);
System.out.println("accessing static members of class B");
System.out.println(B.w);
B.method();
System.out.println("acceessing static members of class C");
A h1=new A();
System.out.println(h1.f+" :  "+h1.g);
h1.test();
B j1=new B();
System.out.println(j1.z+"  :  "+j1.y);
j1.method();


	}

}

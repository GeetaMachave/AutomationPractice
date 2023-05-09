package holerevision;

public class Exp1 {
	static double goa =45;
	char k='d';
	boolean value=true;
	float age=5;
	public static void test1() {
		System.out.println("i am static method with returntype void");
		System.out.println("we can create multiple static method in single classwith parameter without parameter,multiple parameter,using string parameter");
	System.out.println("static method without parameter");
	}
	static public void relay(int i) {
		System.out.println("static method with void returntype and integer parameter");
		System.out.println("i");
	}
	static public void display() {
	System.out.println("my name is geeta ");
	System.out.println("my education is be");
	System.out.println("i am from pune");
	}
	static public void major(String name,String location,String profession) {
		System.out.println("my  collage name is :"+name);
		System.out.println("my collage location is :"+location);
		System.out.println("my sister profession is :"+profession);
	}
	int result() {//nonstatic method
		System.out.println(goa);
		return 5;
	}
	double solar() {
		System.out.println("nonstatic method with returntype double");
		return 5.7;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flange=78;
		double angle=55;
		System.out.println("accessing static variable :1) directly from class"+goa);
		System.out.println("static variable using standard :i.e.with classname"+Exp1.goa);
		Exp1 n1=new Exp1();
		System.out.println("accessing local variable :"+flange);
       System.out.println(n1.age);
       Exp1 t1=new Exp1();
       System.out.println(t1.k);
       test1();
       display();
       major("sanchita","ambajogai","12th");
       n1.result();
       t1.solar();
       relay(8);
       //we cannot print void method on syso
       //we can print other datatype method in syso 
       System.out.println(t1.solar());
       System.out.println(t1.result());
	}

}

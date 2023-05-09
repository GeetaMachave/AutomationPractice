package overriding;
class parent4{
	static void relay(){
		System.out.println("static method of relay class");
	}
	void m2() {
	System.out.println("from parent method");	
	}
}
class child extends parent4{
	static void relay() {
		//we cannot override a static method 
	}
	void m2(){
		System.out.println("from child method");
		}
	}
public class exp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 child f1=new child ();
 f1.m2();
 parent4 y1=new child();
 y1.relay();
 
 
	}

}

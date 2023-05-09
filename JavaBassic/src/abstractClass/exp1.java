package abstractClass;
abstract class E{
	abstract public void display();
	void relay() {
	System.out.println("non abstract method of class E");
	System.out.println("50 % abstracted class");
	}
	//abstract class can have both the abstravct and non abstract method 
}

class D extends E{
	public void display() {
		System.out.println("overrided nonabstract method of class E");
	
	class animal extends E{
		public void display() {
			System.out.println("providing body to abstract method ");
		}
	}
	
	
}
public class exp1 {
public static void main() {
	D f1=new D();
	f1.display();
}
}

package constructor;
class A{
	int age=25;
	A(){
		System.out.println("calling constructor");
	}
	void display() {
		System.out.println("calling nonstatic method");
	}
public class cons5 {
void test() {
	System.out.println("calling nonstatic method");
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A c1=new A();
System.out.println(c1.age);
c1.display();

	}
}

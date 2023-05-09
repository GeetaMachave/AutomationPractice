package Interface;
interface printable {
	int age=30;
	void print();
}
interface showable {
public void show();	
static double value=55;
}

public class multiple implements printable,showable{
public void print() {
	System.out.println("overriding print method");
}

	public void show() {
		System.out.println("overriding show method");
	}
public static void main() {
	System.out.println(value);
	
	multiple obj=new multiple();
	obj.print();
	obj.show();
	
}
}

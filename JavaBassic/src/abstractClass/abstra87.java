package abstractClass;
abstract class bike8{
	static double value;
	int salary;
	static void relay() {
		System.out.println("static method of bike class");
	}
	final void display() {
		System.out.println("final method of display");
	}
	bike8(int i){
		System.out.println("integer parameter constructor");
		this.salary=i;
		this.value=90;
		System.out.println(value);
		System.out.println(i);
	}
	
}
class maruti extends bike8{
	maruti(){
		super(6);
	}
	static void relay() {
	System.out.println("overrided static method");	
	
	}
	
}
public class abstra87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
maruti p1=new maruti();
p1.relay();
p1.display();
System.out.println(p1.value);
System.out.println(p1.salary);
	}

}

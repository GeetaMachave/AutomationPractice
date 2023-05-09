package abstractClass;
interface local{
	int age=90;
	void print();

interface global{
	public void show();
}
public class abstraction34 implements local,global{
	public static final int rollno=67;
	public void print() {
	System.out.println("overriding method of local class");	
	}
	public void show() {
	System.out.println("overiding method of global class");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
abstraction34 h1=new abstraction34();
h1.show();
h1.print();
System.out.println(abstraction34.rollno);
System.out.println(h1.age);
	
}
}

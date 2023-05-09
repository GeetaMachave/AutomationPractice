package Interface;
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method/virtual method
}
class abstract4 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		abstract4 obj = new abstract4();
		obj.print();
		obj.show();
		Printable2 obj2 = new abstract4();
		obj2.print();
		//obj2.show();
	}
}
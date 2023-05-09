package abstractClass;
abstract class rohit{
	rohit(int g){
		System.out.println("calling rohit class constructor");
	}
	void express() {
		System.out.println("non abstract method");
	}
	abstract int relay();
	void beautiful() {
		System.out.println("50 % abstract class rohit");
	}
}
class shailesh extends rohit{
	shailesh(){
	super(5);
	System.out.println("shailesh class constructor");
	}
	protected int relay() {
		System.out.println("providing body to the relay method");
		//method should return int value
		return 5;
	}
	void express() {
		System.out.println("we have to use super keyword to acceess express method from parentclass because it is already present in subclass");
		
	}
	void access() {
		express();
		super.express();
	}
}
public class abstractClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shailesh t1 =new shailesh();
		t1.relay();
		t1.express();
		t1.beautiful();
		t1.access();
		System.out.println("program ends");
		rohit y1 = t1;//or new shailesh();
		y1.express();
		y1.beautiful();
	}

}

package abstractClass;
abstract class shape8{
	abstract void show();
	final void loan() {
		System.out.println("final method cannot be overrided but we inherite it");
	}
	
class soap extends shape8{
	void show() {
	System.out.println("");	
	}
}
class washroom extends shape8{
	void show() {
	System.out.println("overrided abstarct method");	
	}
}
public class hierarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
}
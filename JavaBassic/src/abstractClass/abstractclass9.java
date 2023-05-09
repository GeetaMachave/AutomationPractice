package abstractClass;
abstract class animal{
	abstract public void frog();
	void goal() {
		System.out.println("to place in areputed company ");
	}
}
class doggy extends animal{
	public void frog() {
		System.out.println("providing body to inherited abstract method ");
	}
	void goal() {
	System.out.println("overrided nonstatic method");	
	super.goal();
	}
	int display() {
		System.out.println("integer method of class doggy");
		return 4;
	
	}
}

public class abstractclass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doggy k1=new doggy();
k1.frog();
k1.goal();
k1.display();
	}

}

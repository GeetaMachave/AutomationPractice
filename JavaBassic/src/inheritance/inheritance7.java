package inheritance;
class apple2{
	int rules;
	void same() {
		System.out.println("same name method in child and parent class");
	}
	
}
class tomato extends apple2{
	int rules=88;
	void same() {
		System.out.println("super keyword is used to differentiate between parent and chilad class nonstatic member in another non static method");
	}
	public void  shape(){
	System.out.println(super.rules);	
	System.out.println(rules);
	super.same();
	same();
	}

}

public class inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    tomato b1=new tomato();
    b1.shape();
	}

}

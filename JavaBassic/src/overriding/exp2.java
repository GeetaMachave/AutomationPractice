package overriding;
class sanchita {
	sanchita(int r){
	System.out.println("integer parameter constructor of class sanchita");	
	}
	
	
	 public void test(){
	System.out.println("trst method of animal class");	
	}
	void relay() {
		System.out.println("relay method of class sanchita");
	}
}
class pankaj extends sanchita{
	pankaj(){
	super(8);	
	}
	public void goods(){
		super.relay();
		sanchita k1=new sanchita (3);
	System.out.println("test method of dog1 class ");
	k1.test();
	}
	
}
public class exp2 {
	public static void main(String[] args) {	

	}
}

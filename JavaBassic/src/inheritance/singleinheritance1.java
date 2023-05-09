package inheritance;
class country {
	country(int i){
		this();
		System.out.println("i am integer param constructor");
	}
	country(){
		System.out.println("i am zero param constructor ");
	}
	void relay() {
		System.out.println("nonstatic method of class country");
	}
	
}
class state extends country{
	state(){
		super(8);
	}
	void guess() {
		System.out.println("nonstatic method of state");
	}
}

public class singleinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
//
 */
		state r1 =new state();
		r1.guess();
		r1.relay();
		System.out.println("accessing both class members using single reference variable because of extends");
		System.out.println();
	}

}

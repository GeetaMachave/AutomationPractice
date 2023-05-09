package inheritance;
class W {
	//default constructor
	static int rupay=9000;
	float skill=55;
	W (){
		this(45);
		System.out.println("zero parameter constructor");
	}
	W(int i){
	System.out.println("i am integer parameter constructor");	
	}
	void myroom() {
		System.out.println("i am method of class W");
	}
}
class X extends W{
	X(){
		super();
		System.out.println("i am zero parameter constructor");
	}
	char h='l';
	void name() {
		System.out.println("i am method of class X");
	}
}

public class singleinheritance {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		W h1=new W();
		System.out.println(h1.skill);
		System.out.println("program ends");
		h1.myroom();
		
		
		
		
		
			
			
		}
}
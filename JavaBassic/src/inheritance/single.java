package inheritance;
class country1{
	country1(int i){
	System.out.println("i am integer parameter constructor of class country1");	
	}
	void calling() {
		System.out.println("i am result method of class country1");
	}
}
class state2 extends country1 {
	state2(){
		super(78);
		System.out.println("zero parameter constructor");
	}
	void calling() {
		System.out.println("calling method of class state2");
	}
	void finally3() {
	super.calling();	
	}
}
public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		state2 y1=new state2();
	y1.finally3();
		y1.calling();
	}

}

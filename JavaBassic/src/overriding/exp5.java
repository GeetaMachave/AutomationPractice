package overriding;
class animal6{
void move() {
	System.out.println("animal class method");
}
}
class dog8 extends animal6{
	void move() {
		System.out.println("dog class method");
	}
}
public class exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog8 u1=new dog8();
		u1.move();
		animal6 b1=new animal6();
		b1.move();
		animal6 p1=new dog8();
		p1.move();
		
		
	}

}

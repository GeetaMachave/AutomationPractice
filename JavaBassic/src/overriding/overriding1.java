package overriding;
class animal{
	animal(){
		
	}
	public void move() {
		System.out.println("animal can move");
	}
}
class dog extends animal{
	dog(){
		
	}
	public void move() {
		System.out.println("dog can walk and run");
	}
}
public class overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal t1=new animal ();
t1.move();
dog access=new dog();
access.move();
	}

}

package inheritance;
class fruit8{
	fruit8(int long1){
	System.out.println("zero parameter constructor");	
	}
	public void taste() {
		System.out.println("taste method of fruit class");
	}
}
class apple extends fruit8{
	apple(){
		super(56);
		System.out.println("no need to write super statement explicitely");
	}
	public void shape() {
		System.out.println("nonstatic method of class apple");
	}
}
public class singl6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple p1=new apple();
		p1.shape();
		p1.taste();
		
	}

}

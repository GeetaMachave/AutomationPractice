package abstractClass;
abstract class bike{
	int i;
	bike(){
		this.i=10;
		this.i=i;
		System.out.println(i);
	}
	void bumper() {
		System.out.println("non static method of bike");
	}
}
class honda extends bike{
	void sugar() {
		System.out.println("nonstatic method of class honda");
	}
}

public class abstarct3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bike g1=new honda();
g1.bumper();
	}

}

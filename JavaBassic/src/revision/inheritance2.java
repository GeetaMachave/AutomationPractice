package revision;
class gaurav {

	double salary=10;
	static int i;
	gaurav(int i){
		this('l');
		this.i=i;
		System.out.println(i);
		System.out.println("hello integer parameter constructor");
	}
	gaurav(char b){
		System.out.println("super class constructor chaining");
		System.out.println("here we use this keyword super keyword statements and constructor chaining");
	}
}

public class inheritance2 extends gaurav{
	double salary;
	inheritance2(){
	super(3);
	System.out.println("hello class inheritance2");
	System.out.println(super.salary);
	System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
inheritance2 t1=new inheritance2();
	}

}

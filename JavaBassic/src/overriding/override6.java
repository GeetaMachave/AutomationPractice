package overriding;
class demo{
int test() {
	System.out.println("test method of demo class");
	return 5;
}
}
class demo3 extends demo
{
int test() {
	System.out.println("test method of demo3 class");
	return 9;
}
void shape() {
	super.test();
	
}
}
public class override6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	demo3 m1=new demo3();
	m1.test();
	
	
	
	
	}

}

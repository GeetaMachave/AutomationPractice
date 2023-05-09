package abstractClass;
abstract class w{
abstract public void reedom();
void freedom() {
	System.out.println("freedom method of class w");
}
	

}
class e extends w{
public void reedom() {
	System.out.println("providing body to abstract method of parent class");
}
int reload() {
	System.out.println("nonstatic method of class e with returntype integer");
	return 6;
}
}
public class exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e t1=new e();
		t1.reload();
		t1.freedom();
	}

}

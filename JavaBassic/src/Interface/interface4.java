package Interface;
interface baby{
int age=63;
void frog();
void pig();

class doll implements baby {
	public void frog() {
	System.out.println("overrided frog method");	
	}
	public void pig() {
	System.out.println("welcom pig method");	
	}
}
public class interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doll n1=new doll();
n1.frog();
n1.pig();
	}
}
}

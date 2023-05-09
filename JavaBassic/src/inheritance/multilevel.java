
package inheritance;
class fourwheeler{
public void wheels() {
	System.out.println("i have four wheels");
}
}
class car extends fourwheeler{
	public void type() {
		System.out.println("i am a car");
	}
	
}
class maruti extends car{
	public void company() {
		System.out.println("i am maruti");
	}
	
}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
maruti t1 = new maruti();
t1.wheels();
t1.type();
t1.company();
	}

}

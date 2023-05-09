package inheritance;
class animal {
static int i=45;
double sendoff=78;
char d='m';
}

public class revision extends animal {
	static void relay() {
		System.out.println("hello revision");
	}
	int display() {
		System.out.println("hello display");
		return 4;
	}//single level inheritance
	//because two classes are involved in inheritance
public static void main(String[] args) {
	System.out.println("hi main method");
	System.out.println(i);
	relay();
	revision y1=new revision();
	System.out.println(y1.sendoff);
	System.out.println(y1.d);
	y1.display();
	
}
}

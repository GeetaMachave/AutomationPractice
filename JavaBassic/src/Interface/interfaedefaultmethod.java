package Interface;
 interface  shailu{
	static void driver() {
		System.out.println("advantage of interface is having static method in interface");
	}
	default void golu() {
		System.out.println("since java8 have default method in interface");
	}
}
 class ashok implements shailu{
	 public static int minimum=90;
 }
public class interfaedefaultmethod {
public static void main() {
	shailu k1=new ashok();
	k1.golu();
	shailu.driver();
	System.out.println(ashok.minimum);
	
}
}

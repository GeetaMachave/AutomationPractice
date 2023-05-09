package systemclass;


public class systemclass1 {
	static int age=25;
	static systemclass1 ref=new systemclass1();
	void display() {
	System.out.println("i am display method of systemclass");	
	}
	void callme() {
		System.out.println("i am callme method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		systemclass1 d1=new systemclass1();
		d1.display();
		d1.callme();
		systemclass1.ref.callme();//we can call nonstatic method through static reference
		systemclass1.ref.display();
		System.err.println("i am error message");//system is a predefined class which belongs to java.lang package which has 3 static 
		//references in,out,errr ..in belongs to inputstream class 
		//out and err belongs to outstream class 
		System.out.println();
		//system is a predefined class .out is a static reference.println is a method 
		System.out.println("system user directory"+System.getProperty("user.home"));//
		System.out.println("current working directory "+System.getProperty("user.dir"));
		System.out.println("clearing this property"+System.clearProperty("user.home"));
		System.out.println("after clearing "+System.getProperty("user.home"));
		System.out.println("after clearing "+System.getProperty("user.dir"));
		System.out.println("setting specific property "+System.setProperty("user.home","" ));
		System.out.println(System.setProperty("user.country", "INDIA"));	
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getProperty("java.home"));
	}
}

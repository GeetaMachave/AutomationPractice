package inheritance;
class scooty{
	void msg() {
		System.out.println("method of scooty");
	}
}
class bile{
	void relay() {
		System.out.println("program starts");
		System.out.println("method of bike");
	}
	
}
class mango extends bike,scooty{
	
System.out.println("we cannot access multiple inheritance using classes");	
}
public class multiple {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

//super statements get confused which parent class constructor have to call 
	}
}

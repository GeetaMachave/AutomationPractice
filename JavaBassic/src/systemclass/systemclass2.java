package systemclass;


public class systemclass2 {
	void manualtesting() {
	System.out.println("i am from manual testing");	
	}
	void automationtesting() {
		System.out.println("i am from automation testing ");
	}
	static systemclass2 k1=new systemclass2();
	public static void main(String[] args) {
		systemclass2 j1=new systemclass2();
		j1.manualtesting();
		j1.automationtesting();
		System.out.println("accessing nonstatic methods through static reference variable");
		systemclass2.k1.manualtesting();
		systemclass2.k1.automationtesting();
		System.err.println("i am error message from systemclass2");
		
	}

}

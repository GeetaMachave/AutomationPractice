package day34.pack1;

public class privatemembers {
	private double load=88;
	private static int test() {
	System.out.println("private method of class privatemembers");	
	return 7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privatemembers j1=new privatemembers();
		System.out.println(j1.load);
		j1.test();
	}
}
class childclasstoaccessprivatemembers{
	public static void main(String[] args) {
		privatemembers p1=new privatemembers();
		/*
			p1.test();
			System.out.println(p1.load);
		*/
		//we cannot access private members outside the class 
	}
}
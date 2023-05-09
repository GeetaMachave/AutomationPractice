package day34.pack1;

public class protected2 {
	protected int age=45;
	protected int test2() {
		System.out.println("non static method of class protected2");
		return 5;
	}
	int salary =54000;
	void display() {
		System.out.println("display method with void returntype nonstatic method");
	}
	private static  int load=78;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protected2 j1=new protected2();
		j1.display();
		j1.test2();
		System.out.println(j1.age);
		System.out.println(j1.salary);
		System.out.println(protected2.load);
		
	}
}
class secondclassinsinglesourcefile{
	public static void main(String[] args) {
		//we cannot access private members outside the class
		//we can acccess the default members within the package only 
		//we can access the protected the members outside the package in child most class 
		protected2 j1=new protected2();
		j1.test2();
		System.out.println(j1.age);
		
	}
	
}
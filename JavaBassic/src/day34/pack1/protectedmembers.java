package day34.pack1;

public class protectedmembers {
	private int age=90;
	int value=77;
	protected double mishthi=66;
	private void relay() {
		System.out.println("hello private method ");
	}
	int  skilled() {
		System.out.println("hi integer returntype nonstatic method");
		return 4;	
	}
	protected static double loan=8877;
	protected double display() {
		System.out.println("protected access modifier with double returntype nonstatic method");
		return 5.6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectedmembers j1=new protectedmembers();
		System.out.println(j1.age);//private nonstatic global variable
		System.out.println(j1.value);//default nonstatic global variable
		System.out.println(protectedmembers.loan);//protected static global variable
		j1.relay();
		j1.skilled();
		j1.display();
	}
}
class accessprotected{
	public static void main(String[] args) {
		
		protectedmembers j1=new protectedmembers();
	System.out.println(j1.value);//default nonstatic global variable
	System.out.println(protectedmembers.loan);//protected static global variable
	
	j1.skilled();
	j1.display();
	//j1.relay();//private members
}
}

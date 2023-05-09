package day34.pack1;

public class exp3default {
	static int default1=90;
	void defaultmethod() {
		System.out.println("non static method of class exp3default");
	}
	private static double salary=8;
	private void skill() {
	System.out.println("nonstatic method of class exp3default");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(exp3default.default1);
		exp3default i1=new exp3default();
		i1.defaultmethod();
		i1.skill();
		System.out.println(exp3default.salary);
	}
}
class accessdefaultmembers{
	public static void main(String[] args) {
		exp3default b1=new exp3default();
		b1.defaultmethod();
		System.out.println(exp3default.default1);
		/*
		System.out.println(exp3default.salary);
		b1.skill();
		*/
		//we cannot access privatemembers outside the class but we can access default members outside the class means in child class also in new class of same package
	}
}
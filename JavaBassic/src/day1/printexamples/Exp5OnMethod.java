package day1.printexamples;

public class Exp5OnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp5OnMethod.displaypersonalInfo();
		displaypersonalInfo();
		displaypersonalInfo();
		calling(963);
		int i=895623;
		calling(i);
		addTwoNumber(10,20);
		addTwoNumber(70,90);
		multiplyTwoNumber(20,50);
}
	public static void displaypersonalInfo() {
		System.out.println("Hi,I am Shailesh");
		System.out.println("I am your Automation Trainer");
		System.out.println("Iam from UP");
	}
	public static void displayPersonalInfo(String name,String profession,String location) {
		System.out.println("Hi,I am"+name);
		System.out.println("I am your"  +profession+ "trainer");
		System.out.println("I am From"+location);
	}
	public static void calling(int num) {
		System.out.println("Hi , I am XYZ ");
		System.out.println("calling using number;"+num);
	}
	static void addTwoNumber(int num1,int num2) {
	System.out.println("Number1 is:"+num1);
	System.out.println("Number2 is:"+num2);
	int res=num1+num2;
	System.out.println("result is:"+res);
}
	static void multiplyTwoNumber(int num1,int num2) {
		System.out.println("Number1 is:"+num1);
		System.out.println("Number2 is:"+num2);
		int res=num1+num2;
	}
}

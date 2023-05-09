package revision2;

public class staticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
display();
staticmethod.display();
display1(41);
staticmethod.display1(960);
calling("panakaj","sanchiita","ashok");
staticmethod.calling("panakaj","sanchiita","ashok");
//we can not print vaoid returntype method on println console
//but we can print other returntype method on println console and we can get output but we cannot perform operation on that result in future
System.out.println("printing result of another static method whose returntype is integer"+test(25,36));
//also we can call this method using claassname
test(25,63);
staticmethod.test(63, 21);
int result=test(25,63);
int finalvalue=result+100;
System.out.println("Printing finalvalue"+finalvalue);
	}
	static public void display() {
		System.out.println("creation of another method in single class with void returntype");
		System.out.println("we are calling display method");
	}
	static public void display1(int num) {
		System.out.println("i am printing variable on console by passing through method using void returntype with int argument"+num);
		
	}
	static public void calling(String brother,String sister,String father) {
		System.out.println("my brother name is "+brother);
		System.out.println("my sister name is "+sister);
		System.out.println("my father name is"+father);
		System.out.println(" i created another method named as calling through string is passed and calling this metthod");
		
	}
	public static int test(int num1,int num4) {
		System.out.println("first number is :"+num1);
		System.out.println("second number is :"+num4);
		int res=num1/num4;
		System.out.println("printing result of reminder or modulus of two number"+res);
		int out=0;
		return out;
}
}

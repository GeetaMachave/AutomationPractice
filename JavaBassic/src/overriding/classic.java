package overriding;
class animal7{
	String colour="my name is geeta";

static void m1() {
System.out.println("static mehod animal class");	
}
}
class doggy extends animal7{
	String color="black";
	static void m1() {
		System.out.println("static mehod doggy class");	
		}
	void show() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
	
}
public class classic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doggy p1=new doggy();
p1.show();
p1.m1();
String s1="12 servers";
animal7 s11=new doggy();
s11.m1();

System.out.println(s1.matches(".+[\\s]servers"));
System.out.println(s1.indexOf("shailesh"));

	}

}

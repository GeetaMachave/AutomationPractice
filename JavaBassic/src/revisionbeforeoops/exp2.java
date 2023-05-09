package revisionbeforeoops;

public class exp2 {
public static void display() {
	System.out.println("my name is geeta");
	System.out.println("i am from pune");
	System.out.println("i am currently working in alfa boilers private limited pune ");
	System.out.println("in my family there are four members");
	System.out.println("my fammily is nuclear family");
}
static public void test(int num1) {
	//with para,meter static method
	System.out.println("any value that we are passing is printed on connsole "+num1);
}
private  void status(char c) {
	System.out.println("char 'c' ");
	System.out.println("value of char is c:" +c);
}
void test2(String name,String prof,String place) {
	System.out.println("my name is "+name);
	System.out.println("i am studying in :"+prof);
	System.out.println("i am currently living in :"+ place );
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp2.display();
exp2.test(89);
exp2 n1 = new exp2();
n1.status('d');
n1.test2("sanchita","12th","ambajogai");


	}

}

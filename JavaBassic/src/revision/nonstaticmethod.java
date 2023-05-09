package revision;

public class nonstaticmethod {
public static void main (String [] args) {
	nonstaticmethod  e1 = new nonstaticmethod ();
	e1.addtwonumber();
	System.out.println(e1.multiplytwonum(96,22));
	e1.anothermethod("pune","sixty thousand","twenty four year old");
	e1.multiplytwonum(36,89);
	int res=e1.multiplytwonum(36,89);
	int finalvalue=res+400;
	System.out.println("printing final value after addition :"+res);
	
}
void addtwonumber() {
	int num1=10,num2=20;
	System.out.println("addition result is :"+(num1+num2));
}
void anothermethod(String location, String salary,String age) {
	System.out.println("pune is my current :" +location);
	System.out.println("my current salary is "+salary);
	System.out.println("my age is :"+age);
}
int multiplytwonum(int num1,int num2) {
	System.out.println("first number is :"+num1);
	System.out.println("second number is :"+num2);
	int res=num1*num2;
	System.out.println("result is"+res);
	return res;
}
}

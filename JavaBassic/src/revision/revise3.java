package revision;

public class revise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revise3 b1=new revise3();
b1.addtwonumber(78,23);
System.out.println(b1.quotient(45,63));
System.out.println(b1.reminder(88,22));
System.out.println(b1.asciivalue());
	}
void addtwonumber(int a,int b) {
	System.out.println("first variable is"+a);
	System.out.println("second variable is "+b);
	int res=a+b;
	System.out.println(res);
}
int quotient(int c, int d) {
	System.out.println("first value is"+c);
	System.out.println("second value is :"+d);
	int res= c/d;
	System.out.println(res);
	return res;
}
double reminder(int num1, int num2) {
	System.out.println("first variable is"+num1);
	System.out.println("second variable is"+num2);
	int res=num1%num2;
	System.out.println(res);
	return res;
}
double asciivalue() {
	char c1='A';
	int a=c1;
	System.out.println(a);
	return a;
}void multiplytwonumber(int a,int b) {
	System.out.println("first variable is"+a);
	System.out.println("second variable is "+b);
	int res=a*b;
	System.out.println(res);
}
void subtracttwonumber(int a,int b) {
	System.out.println("first variable is"+a);
	System.out.println("second variable is "+b);
	int res=a-b;
	System.out.println(res);
}
void twonumber(int a,int b) {
	System.out.println("first variable is"+a);
	System.out.println("second variable is "+b);
	int res=a+b;
	System.out.println(res);
}

}

package day16.operators;

public class UnaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=a;
System.out.println(a);
System.out.println(b);
int k=++a;
System.out.println(k);
System.out.println(a);
int j=++k;
System.out.println(k);
System.out.println(j);
Display();
	}
public static void Display() 
{
	int a=10,b,c;
	b=++a + a++ + a;
	System.out.println(a);
	System.out.println(b);
	c=a++ + ++a + ++a + a++;
	System.out.println(c);
	System.out.println(a);
}
}
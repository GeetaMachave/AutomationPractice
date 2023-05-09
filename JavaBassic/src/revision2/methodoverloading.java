package revision2;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//when we declare a method more than once with different set of parameter is known as method overloading
	}

	
	
static public void square(int num1,int num2) {
	System.out.println("here we are performing method overloadin");
	System.out.println(num1*num2);
}

static public void square(float a,float b) {
 System.out.println("first number is"+a);
 System.out.println("second number is:"+b);
	float res = a * b;
System.out.println("square of floating point number"+res);
}
}

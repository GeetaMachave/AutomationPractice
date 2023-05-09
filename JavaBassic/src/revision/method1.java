package revision;

public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 addtwonumber(58,65);
 asciivalue('z');
 multipleparameter("BE","dy patilcollage","international univercity");
 dividetwonumber(65,32);
 int put=dividetwonumber(65,32);
 int finalvalue=put+400;
 System.out.println(finalvalue);
	}
	//we are accessing  static method
static void addtwonumber(int num1, int num2)
{
	System.out.println("First number is"+num1);
	System.out.println("second number is :"+num2);
	int res = num1+num2;
	System.out.println("result is"+res);
}

static int asciivalue(char c) {
 return c;
}
static void multipleparameter(String education,String collage,String institute) {
	System.out.println("i completed my "+education);
	System.out.println("my collage name is "+collage);
	System.out.println("i completed BE from :"+institute);
}
static int dividetwonumber(int num3,int num4) {
	int out =num3/num4;
	System.out.println("division result is :"+out);
	int put=out;
	return put;
}
}


package revision;

public class revise {
	static int variable ;
	double out;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char charvariable ='g';
boolean booleanvariable=true;
System.out.println("static global variable is :"+variable);
revise y1 = new revise();

System.out.println("nonstatic global variable is :"+y1.out);
System.out.println("local variable is :"+charvariable);
variable=12;
System.out.println("reinitialized static global variable is :"+variable);
y1.out=98;
System.out.println("reinitialized non static global variable is ,but to reinitialize we have to use with object"+y1.out);
charvariable ='f';
System.out.println("reinitialized global variable is "+charvariable);
System.out.println(y1.out);
revise y2 =new revise();
System.out.println(y2.out);
	}

}

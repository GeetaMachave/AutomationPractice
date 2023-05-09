package revisionbeforeoops;

public class exp1 {
	static float floatvariable=98;
	double r=56;
boolean a=false;
char and='d';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int out=56, clear=56;
System.out.println(out+clear);
System.out.println();//we cannot access nonstatic variable directluy
exp1 c1 = new exp1();
System.out.println(c1.and);
System.out.println(c1.a);
System.out.println(floatvariable+c1.r);
System.out.println(exp1.floatvariable+c1.r);

	}

}

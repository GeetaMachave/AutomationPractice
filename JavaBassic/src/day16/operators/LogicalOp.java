package day16.operators;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean bool1=true,bool2=false,res;
//for logical and operation
System.out.println("bool1&&bool2 is:"+(bool1&&bool2));
//for logical or operation
System.out.println("bool1||bool2 is:" + (bool1||bool2));
	//for logical not operation
res=!(bool1&&bool2);
System.out.println("!(bool1&&bool2) is"+res);
	}
}
class Logical1{
	public static void main(String [] args) {
		int num1=89,num2=45;
		boolean bool1=(num1==num2);
		boolean bool2=(num2<num1);
		System.out.println("logical and operation is"+(bool1&&bool2));
		System.out.println("logical or operation:"+(bool1||bool2));
		System.out.println("logical not opearation is"+!(bool1==bool2));
	}
}
class Logical2{
	public static void main(String [] args) {
		int num1=-8,num2=2;
		System.out.println("bool1&&bool2 is:"+((num1<num2&&(num1==num2))));
		System.out.println("logical or operation"+((num1!=num2)||(num2<=num1)));
	}
}
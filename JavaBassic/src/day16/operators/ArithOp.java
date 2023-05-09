package day16.operators;

public class ArithOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=89,num2=872;
		int res=num1+num2;
		System.out.println("num1 is=:"+num1);
		System.out.println("num2 is=:"+num2);
		System.out.println("res is=:"+res);
		//for subtraction operation
		res=num1-num2;
		System.out.println("difference is=:"+res);
		//for multiplication variable
		System.out.println("multiplied value is=:"+(num1*num2));
		//for division operation
		res=num1/num2;
		System.out.println("divide value is=:"+res);
		//for modulus operation
		System.out.println("reminder  is=:"+(num1%num2));
		Arithmatic();
	}
	public static void Arithmatic() {
	double val1=36,val2=96,result;
	//for addition
	result=val2+val1;
	System.out.println("val1 is=:"+val1);
	System.out.println("val21 is=:"+val2);
	System.out.println("result is=:"+result);
	}
}
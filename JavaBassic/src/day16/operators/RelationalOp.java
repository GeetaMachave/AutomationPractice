package day16.operators;

public class RelationalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=14,num2=78;
System.out.println("Program Starts");
System.out.println("num1:"+num1+"num2:"+num2);
//is equat to operation
boolean res=num1==num2;
System.out.println("num1==num2:"+res);
//is not equal to operation
res=num1!=num2;
System.out.println("num!=num2:"+res);
//greater than 
System.out.println("num1>num2:"+(num1>num2));
//for less than operation
res=num1<num2;
System.out.println("num1<num2:"+res);
//for greater than equal to operation 
System.out.println("num>=num2:"+(num1>=num2));
//for less than equal to operation
System.out.println("num1<=num2:"+(num1<=num2));
	}
}
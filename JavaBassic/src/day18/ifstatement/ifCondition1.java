package day18.ifstatement;

public class ifCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double num1=25,num2=52;
 if(num2>num1){
	 System.out.println("number1 is greater than number2");
 }
 else {
	 System.out.println("number1 is less than number2");
 }
 if(num1<num2) {
	 System.out.println("number2 is greater than number1");
 }
 else {
	 System.out.println("num1 is less than num2");
 }
 if(num1==num2) {
System.out.println("number1 is not equal to num2");	 
 }
 else {
	 System.out.println("num2 is greater");
 }
 if(num1<num2||num1!=num2) {
	System.out.println("logical or operation is done here");
	}
 if(num1<num2&&num1!=num2) {
	 System.out.println("Logical and operation is performed");
 }
 int sub1=50, sub2=30;
 if(sub1>35&&sub2>35) {
	 System.out.println("result is pass");
 }
 else {
	 System.out.println("Result is fail");
 }
	}	
}
class equalornot{
	public static void main(String[]args) {
		int i=58;
		if(i==15) {
			System.out.println("i is :"+i);
		}
		else if(i==24) {
			System.out.println("i is :"+i);
		}
		else if (i==58) {
			System.out.println("i is:"+i);
		}
		else {
			System.out.println("i is not equal");
		}
	System.out.println("we are using if else ladder in this programm");
	}
	
	
}
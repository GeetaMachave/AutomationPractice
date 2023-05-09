package revision;

public class OperationOnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtwonumber(25,36);
		OperationOnMethod.addtwonumber(68,88);
		OperationOnMethod.addtwonumber(100,102);
		addtwonumber(25,63);
	}
static void addtwonumber(int num1,int num2) {
	System.out.println("num1 value is : "+num1);
	System.out.println("num2 value is : "+num2);
	int res=num1+num2;
	System.out.println("result is"+res);
	int sub =num2-num1;
	System.out.println("subtraction result is:"+sub);
	System.out.println("multiplication result is:"+(num1*num2));
	System.out.println("division operation is:"+(num2/num1));
	int out=num1+num2;
	System.out.println("if we want to use this result value in future"+out);
}
}

package revision;

public class swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
swapping(65,98);
swapping(89,52);
char c1='A';
int a=c1;
System.out.println(a);
	}
static void swapping(int num1,int num2) {
	System.out.println("before swapping num1 value is :"+num1);
	System.out.println("before swapping num2 value is :"+num2);
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("after swapping num1 value is :"+num1);
	System.out.println("after swapping num2 value is :"+num2);
}
}

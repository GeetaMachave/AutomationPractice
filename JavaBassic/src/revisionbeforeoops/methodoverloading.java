package revisionbeforeoops;

public class methodoverloading {
	static void test1() {
		System.out.println("method overloading with zero parameter");
	}
	static void test1(int a) {
		System.out.println("method overloading with interger parameter");
	}
	static void test1(boolean b) {
		System.out.println("overloading with boolean :"+b);
	}
	static void test1(int n,int m) {
		System.out.println(n+m);
	}
	 static int status(int num1,int num2) {
	System.out.println("my name is "+num1);	
	System.out.println(num2);
	int res=num1+num2;
	return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverloading.test1();
methodoverloading.test1(true);
methodoverloading.test1(87,23);
methodoverloading.test1(96);
	System.out.println(status(22,11));
	methodoverloading.status(88,55);
	int res=methodoverloading.status(88,55);
	int finalvalue=res*11;
	System.out.println(finalvalue);
	
	
	}

}

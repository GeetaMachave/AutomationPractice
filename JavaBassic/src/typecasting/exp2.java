package typecasting;

public class exp2 {
	void test1(double d) {
		System.out.println("value of d  "+d);
	}
	/*void test1(int k) {
		System.out.println("value of k  "+k);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		exp2 p1=new exp2();
		p1.test1(78);
		p1.test1(12.33);
		//here java compiler finds integer argumented method but if not found then it will call double argumented method
		//because double is the datatype which stores all type of datatype
		//here implicite widening is performed
	}

}

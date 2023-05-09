package revision;
class a1{
	void test1() {
		System.out.println("nonstatic method of class a1");
	}
}
class b1 extends a1{
	void test2() {
		System.out.println("nonstatic method of class b1");
	}
}

public class nonprimitivecasting {
	//to perform non primitive casting we require classes which are present in inheritance
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 h=new b1();//homogeneous statement
		h.test2();
		h.test1();
		a1 j=h;//implicite/auto upcasting
		a1 l=(a1)h;//explicite upcating
		//upcasting means converting child class object into parent class object 
		l.test1();
		b1 downcast=(b1)j;
		downcast.test1();
		//downcast.tets2();
	}

}

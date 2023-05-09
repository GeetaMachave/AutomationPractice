package revision;
class a2{
void test1() {
	System.out.println("running test1()");
}
}
class b2 extends a2{
void test2() {
	System.out.println("running test2()");
}
}
class c2 extends b2{
void test3() {
	System.out.println("running test3()");
}
}
public class nonprimitivecasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b2 ref=new c2();
		ref.test1();
		ref.test2();
		c2 k1=new c2();
		b2 h1 =k1;//implicite /auto upcasting
		b2 m1=(b2)h1;//explicite upcasting
		m1.test2();
		m1.test1();
		a2 l1= k1;
		l1.test1();
		//l1.test2();
		b2 g1=new b2();
		a2 n1=g1;//implicite /auto upcasting
		a2 s1=(a2)g1;//explicite upcasting 
		c2 z1 =(c2)ref;//explicite downcasting
		
		
	}

}

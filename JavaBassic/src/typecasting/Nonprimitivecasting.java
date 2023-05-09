package typecasting;
class A{
void test1() {
	System.out.println("we are in class A");
}
}
class B extends A{
void test2() {
	System.out.println("we are in class B");
}
}
class C extends B{
void test3() {
	System.out.println("we are in class C");
}
}
public class Nonprimitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B j1=new C();//implicite/AutoUpcasting
		B k1=(B)new C();//Explicite upcasting
		A n1=j1;//implicite auto up casting
		A n2=(A) j1;//explicite upcasting
	}

}

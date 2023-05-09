package typecasting;

class geeta1{
	void test3() {
	System.out.println("non static method of class geeta ");	
	}
	int salary=78;
}
class pankaj extends geeta1{
	void test4() {
		System.out.println("nonstatic method of class pankaj ");
	}
}
class sanchita extends pankaj{
	void test5() {
	System.out.println("nonstatic method of class pankaj");	
	}
	double empid=8923;
}
public class Derivedcasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		geeta1 r1= (geeta1)new sanchita();//explicite upcasting
		//upcasting means converting child class object into parent class object 
		r1.test3();
		//r1.test4();
		//r1.test5();
		pankaj u1=(pankaj)r1;//explicite downcasting
		u1.test4();
		u1.test3();
		sanchita m1=(sanchita)r1;//explicite downcasting 
		m1.test5();
		//downcasting means converting parent class object into subclass object is 
		//implicite downcasting is not possible only explicite downcasting is possible 
		
		
		
	}

}

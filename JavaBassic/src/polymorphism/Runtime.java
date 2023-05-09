package polymorphism;
class shailesh3{
	void remark() {
		System.out.println("remark method of shailesh3 class ");
	}
}
class manohar extends shailesh3{
	void remark() {
		System.out.println("overrided method of class manohar ");
	}
}

public class Runtime {
	//when a method gets to know its inplementation at the time of execution is known as runtime polymorphism 
	//to achieve runtime polymorphism we need inheritance , upcasting, , overriding 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shailesh3 j1=new manohar();
		j1.remark();
	}

}

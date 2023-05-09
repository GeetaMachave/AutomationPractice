package thiskeyword;

public class example6 {
	void m(){
		System.out.println("i am from method m");	
	}
	void n() {
		System.out.println("i am from method n ");
		m();
		this.m();
		
	}
	
class Test{
	void methodone() {
		System.out.println("i am methodone");
	}
	void methodtwo() {
		System.out.println("i am methodtwo");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
example6 h1 = new example6();
h1.n();



	}

}

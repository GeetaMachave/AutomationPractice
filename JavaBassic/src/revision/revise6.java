package revision;

public class revise6 {
	static double age =99;
	double out=78;
	
	int salary=88000;
	
	
	revise6(){
		System.out.println("i am zero parameter constructor");
		
	}
	revise6(int a){
		System.out.println("i am integer parameter constructor");
		salary=a;
		System.out.println(a);
	}
	revise6(double b){
		System.out.println("i am float type constructor,also different type of constructor");
		age=b;
		System.out.println(age);
		
	}
	revise6(double num1,double num2){
		System.out.println("i am number of parameter diff constructor");
		age=num2;
		out=num1;
		System.out.println(age);
		System.out.println(out);	
	}
	revise6(char c){
		System.out.println("i am charactor constructor");
		
	}
	void display() {
		System.out.println(age + " " + salary);
	}
	void test(int num5) {
		System.out.println("initialization of method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   revise6 n1=new revise6();
   revise6 s1=new revise6('f');
   revise6 a1=new revise6(96.2);
   revise6 b1=new revise6(44.1,76.2);
   revise6 c1=new revise6(78);
   a1.salary=777;
   c1.age=14;
   a1.display();
   c1.test(45);
   
	}
}

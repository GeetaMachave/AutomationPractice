package holerevision;

public class exp3 {
	int age;
	double salary;
	
	static void display() {
		System.out.println("overloading with zero parameter");
	}
	static void display(int num1) {
	System.out.println("overloading with diff of no.of parameter ");
	int serial=num1;
	System.out.println(serial);
	}
	static void display(double num2,int num3) {
	double res=num2+num3;
	System.out.println(res);
	}
	static void display(int num3,double num2) {
		System.out.println("diff in position of parameter");
	}
	static void display(double salary) {
		salary =salary;
		System.out.println("type of parameter differ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 display();
 display(2.1);
 display(66);
 display(78,5.3);
 display(9.77,55);
	}

}

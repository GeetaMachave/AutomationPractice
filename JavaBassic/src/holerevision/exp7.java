package holerevision;

public class exp7 {
	int age;
	double salary;
	exp7(){
		System.out.println("user defined zero parameter constructor");
		age=25;
		salary=88000;
	}
	exp7(int age , double salary){
		this.age=age;
		this.salary=salary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		exp7 y1=new exp7();
		System.out.println(y1.age);
		System.out.println(y1.salary);
		exp7 t1=new exp7(12,3.3d);
		System.out.println(t1.age);

	}

}

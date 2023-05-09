package arrays;

public class exp8 {
	int age;
	double salary;
	exp8(){
		System.out.println("zero parameter constructor");
	}
	exp8(int a){
		age=a;
	System.out.println("integer parameter constructor");	
	}
	exp8(double b){
		salary=b;
		System.out.println("double parameter constructor");
	}
	void calling() {
		System.out.println(age);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp8 j1=new exp8();
		exp8 m1=new exp8(15);
		exp8 q1=new exp8(23.56);
		j1.calling();
		m1.calling();
		q1.calling();
		
		exp8[] h = {new exp8(),new exp8(15),new exp8(23.56)}; 
		h[0]=new exp8();
		h[1]=new exp8(12);
		h[2]=new exp8(23.63);
		
	}

}

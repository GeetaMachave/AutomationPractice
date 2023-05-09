package revisionbeforeoops;

public class cloading2 {
	int salary;
	double age;
	cloading2(int s,double r){
	salary=s;
	age=r;
	
	}
	cloading2(int salary){
		this.salary=salary;
		
	}
	cloading2(double age){
		this.age=age;
		
	}
	void test() {
		System.out.println(salary+""+age);
	}
	
	
	void display(){
		System.out.println(salary + ""  +age);
		this.salary=12;
		System.out.println(salary);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cloading2 n1 =new cloading2(58.0);
n1.display();
cloading2 n2 =new cloading2(74);
n2.display();

	}

}

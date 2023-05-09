
public class constructor {
	int age =10;
	double salary =53000;
	constructor(){
		System.out.println("Hello i am zero parameter constructor");
	}
	constructor(int num1){
		age=num1;
		System.out.println("re initializing nonstatic global variable through constructor: "+age);
		System.out.println(salary);
		
	}
	constructor(double num2){
		salary=num2;
		System.out.println("reinitializing nonstatic global variable through constructor"+salary);
		System.out.println(age);
	}
	constructor(int num3,double num4){
	num3=age;
	num4=salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor v1=new constructor();
constructor a1=new constructor(23.56f);
constructor c1=new constructor(89);
constructor r1=new constructor(58,56.32f);
System.out.println(v1.age);
System.out.println(c1.salary);

	}

}

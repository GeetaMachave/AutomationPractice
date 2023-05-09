package revision2;

public class constructor2 {
int fee;
double school;

public constructor2() {
	System.out.println("this is zero parameter constructor");// TODO Auto-generated constructor stub
}
constructor2(int num1) {
System.out.println("this is integer parameter constructor");
System.out.println(num1);
fee=num1;
System.out.println(fee+"and"+school);
}
constructor2(double salary){
	System.out.println("This is double parameter constructor");
	System.out.println(salary);
	school=salary;
	System.out.println(fee+"and"+school);
	
}
constructor2(int num3,double num4){
	System.out.println("it is integer and dou le parameter constructor");
	fee=num3;
	school=num4;
	System.out.println(fee+"and"+school);
	
}

public static void main(String [] args) {
	constructor2 n1=new constructor2 ();
	constructor2 n2=new constructor2(56f);
			constructor2 b1=new constructor2(10);
			constructor2 m1=new constructor2(36,56);		
				
			}
					
}


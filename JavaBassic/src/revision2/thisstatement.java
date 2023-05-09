package revision2;

public class thisstatement {
	int age;
	thisstatement(){
	this(2.2d);	
	System.out.println("zero parameter constructor");
	}
	thisstatement(int age){
		this.age=age;
		System.out.println(age);
	System.out.println("calling integer parameter constructor");	
	}
	thisstatement(double d){
		this(8);
	System.out.println("calling double parameter constructor");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thisstatement t1=new thisstatement();

	}

}

package revision2;

public class constructor3 {
	int roll;
	double salary;
	constructor3(int num1,double num2){
		roll=num1;
		salary=num2;
		
	}
	void display(){
	System.out.println(roll+"and"+salary);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor3 n1=new constructor3(10,89);
n1.display();
constructor3 n4=new constructor3(98,65);
n4.display();

	}

}

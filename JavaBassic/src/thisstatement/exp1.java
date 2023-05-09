package thisstatement;

public class exp1 {
	int salary;
	double scope;
exp1(){
	this(89);
	this.salary=89;
	System.out.println("i am zero parameter constructor");	
}
exp1(int num1){
	this(56.23);
System.out.println("i am integer type constructor");	
}
exp1(double num2){
	System.out.println("i am double type constructor");
}
void display() {
	System.out.println("printing reinitialized constructor"+salary+scope);
}
//here i want to print double int zero 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp1 n2=new exp1();
n2.display();
	}

}

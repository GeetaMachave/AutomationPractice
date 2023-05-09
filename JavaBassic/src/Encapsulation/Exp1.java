package Encapsulation;

public class Exp1 {
	private double salary=89000;
	private int empid=78;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp1 l1=new Exp1();
		System.out.println(l1.salary);
		System.out.println(l1.empid);
	}
	//getter=method which helps to access private members from class 
	public double getsalary() {
		return salary;
	}
	public int empid() {
		return empid;
	}
	public void setsalary(double i) {
	salary=i;	
	}
	public void setempid(int j) {
	empid=j;	
	}
}
class accessexp1{
	public static void main(String[] args) {
		 
		 Exp1 l1=new Exp1();
		 /* private members are accessed within the class only
		System.out.println(l1.salary);
		System.out.println(l1.empid);
	*/
		l1.getsalary();
		l1.empid();
		System.out.println(l1.getsalary());
		System.out.println(l1.empid());
		l1.setsalary(44);
		l1.setempid(55);
		System.out.println(l1.getsalary());
		System.out.println(l1.empid());


			}
}
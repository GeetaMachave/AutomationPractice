package Encapsulation;

public class exp3 {
	private int employee =89;
	private double salary=56;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp3 h1=new exp3();
		System.out.println(h1.employee);
		System.out.println(h1.salary);
	}
	public int getemployee() {
		return employee;
	}
	public double getsalary() {
		return salary;
	}
	public void setemployee(int employee) {
		this.employee=employee;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
}
class anothers{
	public static void main(String[] args) {
		exp3 u1=new exp3();
		System.out.println(u1.getemployee());
		System.out.println(u1.getsalary());
		u1.setemployee(89);
		u1.setsalary(45);
		System.out.println(u1.getemployee());
		System.out.println(u1.getsalary());		
	}
}
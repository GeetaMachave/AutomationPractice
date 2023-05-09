package Encapsulation;

public class Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp1 l1=new Exp1();
		 /* private members are accessed within the class only
		System.out.println(l1.salary);
		System.out.println(l1.empid);
	*/
		l1.getsalary();
		l1.empid();
		System.out.println(l1.getsalary());
		System.out.println(l1.empid());

		
	}

}

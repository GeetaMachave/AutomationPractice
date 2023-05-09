package constructor;

public class cons3 {
int age;
int salary;
cons3(){
	System.out.println("user defined zero parameter constructor");
	 age =65;
	 salary=89000;
	System.out.println("useer defined zero parameter constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cons3 b1=new cons3();
System.out.println("printing upated value of nonstatic variable  on console "+b1.age);
System.out.println(b1.salary);
	}

}

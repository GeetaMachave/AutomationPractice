package constructor;

public class cons2 {
int age;
int salary;//here default constructor initialize nonstatic members into class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cons2 b1=new cons2();
b1.age=63;
System.out.println("printing nonstatic variable she value on console "+b1.age);
System.out.println(b1.salary);
	}

}

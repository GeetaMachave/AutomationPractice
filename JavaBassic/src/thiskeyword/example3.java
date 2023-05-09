package thiskeyword;

public class example3 {
double salary;
example3(double salary){
	System.out.println(salary);
	this.salary=salary;
}
void Display() {
	System.out.println(salary);
	System.out.println(salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double school=78000;
System.out.println(school);
example3 n3=new example3(80000);

n3.Display();
	}

}

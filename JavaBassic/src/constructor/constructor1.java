package constructor;

public class constructor1 {
int num1=25;
void display() {
	System.out.println("hi am nonstatic zero parameterised method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor1 v1=new constructor1();//default constructor is there
System.out.println(v1.num1);
v1.display();
	}

}

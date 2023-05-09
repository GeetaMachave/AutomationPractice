package revision2;

public class constructor1 {
int  salary;
double fee;
constructor1(int num1,double out){
	salary=num1;
	fee=out;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor1 n1 = new constructor1(12,36.50);
System.out.println(n1.salary);
System.out.println(n1.fee);
n1.fee=35000;
n1.salary=78000;
System.out.println(n1.fee);
System.out.println(n1.salary);
	}

}

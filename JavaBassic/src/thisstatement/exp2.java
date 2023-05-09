package thisstatement;

public class exp2 {
int age;
double salary;
exp2(){
this(58,63);	
}
 exp2(int age, double salary ){
	this.age=age;
	this.salary=salary;
}
void test() {
	System.out.println("printing both variable" + age+ " and " + salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp2 r1=new exp2();
r1.test();
	}

}

package thisstatement;

public class exp4 {
int roll;
float school;
exp4(int roll){
	this.roll=roll;
}
exp4(int roll,float school){
	this(roll);
	this.school=school;
}
void test() {
	System.out.println(roll + "and" + school);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp4 n1=new exp4(700);
n1.test();
	}

}

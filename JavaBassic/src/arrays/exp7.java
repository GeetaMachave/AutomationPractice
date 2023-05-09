package arrays;
class example2{
	int age;
	double salary;
	example2(){
		System.out.println("zero parameter constructor");
	}
	example2(int a){
		age=a;
		System.out.println("int param constructor");
	}
	example2(double a){
		salary=a;
		System.out.println("double param constructor");
	}
	void calling() {
		System.out.println(age);
		System.out.println(salary);
	}
}
public class exp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example2 e2 = new example2();
		example2 e3 = new example2(12);
		example2 e4 = new example2(12.23);
		e2.calling();
		e3.calling();
		e4.calling();
		//example2 m1=new example2[]{new ezample2(),new example2(12)new example2(12.23)};
		//example2 n1={new ezample2(),new example2(12)new example2(12.23)}
		example2[] b1=new example2[3];
		b1[0]=new example2();
		b1[1]=new example2(12);
		b1[2]=new example2(12.23);
		b1[0].calling();
		b1[1].calling();
		b1[2].calling();
	}

}

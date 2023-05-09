package thiskeyword;

public class example2 {
int age;
example2(int num5){
age=num5;
System.out.println(age);
}

void Test() {
	System.out.println(this.age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=65;
System.out.println(age);
example2 n1= new example2(10);
n1.Test();

	}

}

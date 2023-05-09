package thiskeyword;

public class example1 {
 int age;
 example1(){
	 System.out.println(this.age);
 }
void dispaly(){
System.out.println(age);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=25;
System.out.println(age);
example1 n1=new example1();
System.out.println(n1.age);

	}

}

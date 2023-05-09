package thiskeyword;

public class example4 {
int age =35;
void display() {
System.out.println("age from display:"+age);
}
void calling(int age) {
	System.out.println("age from calling:"+age);
	example4 h1 = new example4();
	System.out.println("age from global variable"+this.age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
example4 b1=new example4();
b1.calling(0);
b1.display();

	}

}

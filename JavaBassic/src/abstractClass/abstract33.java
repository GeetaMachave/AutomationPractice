package abstractClass;
interface printable{
void test();
}
interface showable {
void test();	
}
public class abstract33 implements printable,showable{
public void test() {
	System.out.println("overriding test method at only one");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
showable r1=new abstract33();
r1.test();
	}

}

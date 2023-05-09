package revision2;

public class nonstaticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nonstaticmethod f1= new nonstaticmethod();
f1.calling(36);
f1.test("geeta","pune","BE");
f1.disp(25, 89);
System.out.println(f1.disp(25, 89));
int res=f1.disp(25, 89);
int finalvalue=res+89;
System.out.println(finalvalue);
	}
public void calling (int num) {
	System.out.println("printing calling method: "+num);
	System.out.println(num);
}
public static void test(String name ,String location,String education) {
System.out.println("my name is "+name);
System.out.println("my current location is"+location);
System.out.println("i completed my "+education);
}
public int disp(double r,double s) {
	System.out.println(r+s);
	int result=0;
	return result;
}
}

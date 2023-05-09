package finalkeyword;

public class finalkey2 {
final double age;
finalkey2(){
	age=78;
	System.out.println(age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
finalkey2 b1 = new finalkey2();
System.out.println(b1.age);
	}

}
class geeta1{
	int cube(final int n) {
		System.out.println(n);
		//we cannot reinitialize final declared variable 
		//we can change its value only once using constructor . n=n+2;
		return n*n*n;
	}
	public static void run () {
		geeta1 v1 =new geeta1();
		System.out.println(v1.cube(10));
	}
}
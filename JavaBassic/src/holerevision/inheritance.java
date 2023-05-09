package holerevision;
class geeta {
	int result;
	double plate;
	void relay() {
		System.out.println("virtually present relay method in class vilas");
	}
	static int goa() {
		System.out.println("integer returntype method is virtually present in class vilas");
		return 5;
	}
	
}
class vilas extends geeta{
	void test() {
		this.result=78;
		int local=90;
		System.out.println("visually present method in class vilas");
		System.out.println(result+local);
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vilas d1=new vilas();
d1.test();
d1.goa();
d1.relay();
System.out.println(d1.result);
System.out.println(d1.plate);
	}

}

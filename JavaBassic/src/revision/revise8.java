package revision;

public class revise8 {
int salary=21;
double volume=66;
float rupay=44;
revise8(int rupay){
	this.rupay=rupay;
System.out.println(rupay);
}
revise8(double volume){
	this.volume=volume;
	System.out.println(volume);
}
void test() {
	System.out.println(rupay);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	revise8 h1 = new revise8(2);
	revise8 k1 = new revise8(55.0);	
	
	k1.test();
	h1.test();
}
}
package day34.pack1;

public class publicrevision {
	public int remark=88;
	public double zento=88;
	public void western() {
		System.out.println("public method of above class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicrevision k1 =new publicrevision ();
		System.out.println(k1.remark);
		System.out.println(k1.zento);
		k1.western();
	}
}
class another4{
	public static void main(String[] args) {
		publicrevision k1 =new publicrevision ();
		System.out.println(k1.remark);
		System.out.println(k1.zento);
		k1.western();

	}
}
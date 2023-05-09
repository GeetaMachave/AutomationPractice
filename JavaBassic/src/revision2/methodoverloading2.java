package revision2;

public class methodoverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(adder.add(11,11));
System.out.println(adder.add(25, 89,23));
	}

}
class adder{
	static int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}

	static int add(int a,int b,int c) {
	return a+b+c;
}
}

package revision2;

public class mainmethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("i am main string");
main(25);
main(85d);
main('g');
	}
	public static void main(int num1) {
		System.out.println("i am main (int)");
	}
	public static void main(double num4) {
		System.out.println("i am double(num4)");
	}
	public static void main(char c) {
		System.out.println("i am main char");
	}
}


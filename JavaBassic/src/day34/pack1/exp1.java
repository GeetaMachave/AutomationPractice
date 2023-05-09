package day34.pack1;

class private3{
	private int r1=78;
	private void display() {
		System.out.println("private method of class private3");
	}
	private int loading() {
		System.out.println("private method loading  of class private3");
		return 4;
	}
	public static void main(String[] args) {
		private3 j1=new private3();
		System.out.println(j1.r1);
		j1.display();
		j1.loading();
	}
}

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private3 u1=new private3();
		//u1.display();
		//u1.loading();
		//private members are acceessed within the class only 
		//it cannot access outside the class
	}

}

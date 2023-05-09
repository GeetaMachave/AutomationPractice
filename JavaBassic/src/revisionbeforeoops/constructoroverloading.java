package revisionbeforeoops;

public class constructoroverloading {
	static int num1=45;
	int num2=89;
	void display() {
		System.out.println("calling nonstatic method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=99;
constructoroverloading n1=new constructoroverloading();
System.out.println(n1.num2);
n1.display();



	}
}

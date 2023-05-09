package overriding;
class donkey7 {
	int num1;
	String name;
	donkey7(int num1,String name){
		this.num1=num1;
		this.name=name;
	}
}
class important extends donkey7{
	float salary;
	important (int num1,String name,float salary){
		super(num1,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(num1+" "+name);
	}
}
public class exp9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		important r1=new important(2,"sohan",5.3f);
		r1.display();	
	}
}

package inheritance;
class vehicle1 {
	public void calling() {
	System.out.println("nonstatic method of class vehicle");	
	}
	
}
class bike9 extends vehicle1{
	public void counttwo() {
		System.out.println("nonstatic method of class bike9");
	}
	
}
class car8 extends vehicle1{
	public void countthree() {
		System.out.println("nonstatic method of car8");
	}
	
}
public class hierarical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car8 u1=new car8();
u1.countthree();
u1.calling();
bike9 k1=new bike9();
k1.counttwo();
k1.calling();
	}

}

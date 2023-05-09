package inheritance;
class grandfather{
void myhome() {
	System.out.println("grandfather have their own home");
}
}
class father extends grandfather{
void mycar() {
System.out.println("father have one car");	
}
}
class child extends father{
void mybike() {
	System.out.println("child have one bike");
}
}
public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child r1= new child();
r1.mybike();
r1.mycar();
r1.myhome();
father l1=new child();
l1.mycar();
//l1.mybike();//using reference of one class and object of other class we can access property of that particular whose reference is given 
	father f1=r1;
	f1.mycar();
	grandfather p1=new grandfather();
	p1.myhome();
	}

}

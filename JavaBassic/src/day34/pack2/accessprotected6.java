package day34.pack2;
import day34.pack1.protected2;

public class accessprotected6 extends protected2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessprotected6 j1=new accessprotected6();
		j1.test2();
		System.out.println(j1.age);
	}
}
//if we are trying to access protected members outside the package we have to use import statement with inheritance
//after using inheritance make object of class where protected members are accessed
class ashok extends accessprotected6{
	public static void main(String[] args) {
		ashok l1=new ashok();
		l1.test2();
		System.out.println(l1.age);
		/*accessprotected6 o1=new accessprotected6();
		o1.test2();
		System.out.println(o1.age);*/
		//we cannot access inherited class members with that class reference 
		//we have to make object of that class where members are inherited
		
	}
}
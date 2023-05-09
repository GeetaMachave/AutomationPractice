package day34.pack2;

import day34.pack1.protectedrevision;
public class accessprotectedrevisionfrompack1 extends protectedrevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessprotectedrevisionfrompack1 j1=new accessprotectedrevisionfrompack1();
		System.out.println("access protected members from pack 1 using import statement and using inheritance");
		System.out.println(j1.salary);
		j1.relay();
	}

}
class another3 extends accessprotectedrevisionfrompack1{
	public static void main(String[] args) {
		another3 u1=new another3();
		System.out.println(u1.salary);
		u1.relay();
	}
}

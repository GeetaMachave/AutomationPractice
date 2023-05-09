package day34.pack2;

import day34.pack1.publicrevision;

public class accesspublicrevisionfrompack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicrevision k1 =new publicrevision ();
		System.out.println(k1.remark);
		System.out.println(k1.zento);
		k1.western();

	}

}
class second{
	public static void main(String[] args) {
		publicrevision k1 =new publicrevision ();
		System.out.println(k1.remark);
		System.out.println(k1.zento);
		k1.western();
	
	}
}
//public members are accessed from everywhere
class third{
	public static void main(String[] args) {
		day34.pack1.publicrevision o1=new day34.pack1.publicrevision();//fully qualified classname meand packagename.classname using this dont need to use import statement
		System.out.println(o1.remark);
		System.out.println(o1.zento);
		o1.western();
		
	}
}
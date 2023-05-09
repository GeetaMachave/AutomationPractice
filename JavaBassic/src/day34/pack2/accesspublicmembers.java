package day34.pack2;

import day34.pack1.publicmembers;

public class accesspublicmembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicmembers n1=new publicmembers();
		System.out.println("accessing public members in same source file but in different class");
		System.out.println(n1.hotspot);
		System.out.println(n1.five);
		n1.test();
	}

}
//we can access public members everywhere without import statement but the only condition is that the particular class is required to declare as public
package predefinedclassobjectclass;

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp1 n1=new exp1();
		//tostring method are used to represent string representation of an object in the form of fullyqualified classname @ hexadecimal address
		System.out.println(n1);//internally java compiler will call tostring method of object class =======> n1.tostring();
		//object class is the parent most also called as super most class 
		System.out.println(n1.toString());//also we can call explicitely tostring method 
		//predefinedclassobjectclass.exp1@515f550a------------>fullyqualifiedclassname@hexadecimaladdress
		
		System.out.println(new exp1());//how many times we make new object output will be diffrent 
		exp1 s1=new exp1();
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(new exp1());
	}

}

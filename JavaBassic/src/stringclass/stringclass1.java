package stringclass;

public class stringclass1 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		String is a predefined class belongs to java.lang package and implementing 3 interfaces 
		serilizable comoparable,charsequence
		string is a group or sequence of characters
		/*
		 * java object of string class is immutable means consatant and we cannot change its value 
		 * there are two ways to create instance of string class 
		 *1) by using literals 
		 *2)by using new keyword   
		 * 
		 * in string== based on address
		 * and s1.equals(s2)==based on value
		 */
		String s1="javagoal";
		String s2="welcome";//using literal object is stored in string constant pool and it will check for uniqueness
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s2.length());
		String s3="sanchita";
		String s4="sanchita";
		System.out.println(s3.equals(s4));//compares based on value
		System.out.println("comapairing s3 and s4 based on addresses    "+(s3==s4));
		System.out.println(s3.length() +"      "+s4.length());
		
		
		//object creation using new keyword 
		String  d1=new String("javabasic");
		String d2 =new String("javabasic");
		System.out.println(d1.equals(d2)+" comparision using address "+(d1==d2));
		String d5="javabasic";
		System.out.println((d1==d5)+"   "+d1.equals(d5));
	}

}

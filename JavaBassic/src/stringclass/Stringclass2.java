package stringclass;

public class Stringclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String class ,methods
		 * charAt
		 * Substring
		 * Substring(2,3)
		 * concat
		 * index of
		 */
		String c1= ("learnjava");
		String c2=new String("learnjava");
		//character at 3rd position 
		System.out.println(c1.charAt(3));//gives charcter at 3rd position 
		System.out.println(c2.substring(3));//gives string from 3rd position 
		System.out.println(c1.substring(5,9));
		System.out.println(c1.concat(c2));
		System.out.println(c1.concat(c2));
		String s3=c1+c2;
		System.out.println(s3);
		System.out.println(c2.indexOf("java"));
		
		String s5="learn and earn ";
		System.out.println(s5.charAt(8));
		System.out.println(s5.substring(5));
		System.out.println("substring from"+s5.substring(1,6));
		System.out.println(s5.concat(c1));
		System.out.println(s5+c2);
		String f1=13+56+c1+12+12;
		System.out.println(f1);
	}

}

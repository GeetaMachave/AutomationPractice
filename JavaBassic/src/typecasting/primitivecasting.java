package typecasting;

public class primitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mydouble =23.12;
		int myint=(int)mydouble;//explicite narrowing
		byte mybyte=(byte)mydouble;//explicite narrowing
		short myshort=(short)mydouble;//explicite narrowing
		System.out.println(myint);
		System.out.println(mybyte);
		System.out.println(myshort);
		//implicite narrowing is not possible
	}
}
class another1{
	public static void main(String[] args) {
		byte s=23;//
		short d=s;
		int f=s;
		long g=s;
		float h=s;
		double k=s;
		System.out.println(s+"next line \n"+d+"next linec\n"+f+"next line \n"+g+"next line \n"+h);
		
	}
	
}
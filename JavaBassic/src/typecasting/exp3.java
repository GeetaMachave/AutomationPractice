package typecasting;

public class exp3 {
	double test1() {
		System.out.println("running test1 method ");
		return 4;
	}
//here above method is retuning value in the form of integer 
	//but its returntype id double so it will return the value in the form of double 
//here implicite widening is performed means return value is 4 which we store into double 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		exp3 r1=new exp3();
		int h1=(int)r1.test1();//here explicite narrowing operation is performing 
	//method returning the value in the form of double and we storing this value into integer means converting higher datatype into lower so explicite narrowing.
	System.out.println(h1);
	System.out.println("program ends");
	
	}

}

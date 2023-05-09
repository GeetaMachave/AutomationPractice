package typecasting;

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening type casting=converting lower data type into higher data type is known as widening type cating
		//widening type casting is performed automatically or manually or we can say implicitely or explicitely
		//implicite widening conversion is performed by java compiler 
		//explicite or manual conversion is performed by us
		int vaishali =78;
		double santosh=vaishali;//implicite/auto widening type casting.............automatically java compiler write statement double santosh=(double)vaishali
		double dhiren=(double) vaishali;//explicite/manual widening type casting
		long dhanu=(long)dhiren;//explicite widening type casting
		float arohi =(float)dhanu;//explicite widening type casting
		System.out.println(arohi);
		System.out.println(dhanu);
		System.out.println(vaishali);
		System.out.println(santosh);
		System.out.println(dhiren);
		
		//Narrowing = converting higher datatype into lower datatype is known as narrowing type casting 
		//narrowing is performed explicitely only 
		double salary=890000.45;
		int narrow=(int)salary;//whenever we perform arrowing operation there is loss of data or loss of size
		System.out.println(salary);
		System.out.println(narrow);//in this narrowing operation loss of data is done.
		float num1=(float)salary;
		System.out.println("Float salary"+num1);
		long num2=(long)salary;//loss in form of data
		System.out.println(""+num2);
		short num3=(short) salary;
		System.out.println(num3);
		
	}

}

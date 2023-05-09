package revision;

public class Primitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shailu=89;
		//widening is the process to convert lower data type into higher datatype
		double misses=shailu;//auto/implicite widening
		double children=(double)shailu;//explicite widening/manual widening
		long num1=shailu;//implicite/auto widening
		long num2=(long)shailu;//explicite/manual widening
		float num3=(float)shailu;//explicite widening
		System.out.println("original shailu "+shailu);
		System.out.println("dounble misses "+misses);
		System.out.println(" double children "+children);
		System.out.println("long num1 "+num1);
		System.out.println("long num2 "+num2);
		System.out.println("float num3 "+num3);
		//narrowing is the process to convert higher datatype into lower datatype
		//and whenever we perform narrowing operation there will be loss of data or size
		double sanchita=45.23;
		float floatsanchita=(float)sanchita;//implicite narrowing cannot posssible //narrowing can be done explicitely only
		long longsanchita=(long)sanchita;//explicite narrowing
		short shortsanchita=(short)sanchita;
		byte bytesanchita=(byte)sanchita;
		int intsanchita=(int)sanchita;
		System.out.println(sanchita+"\n"+floatsanchita+"\n"+longsanchita+"\n"+shortsanchita+"\n"+bytesanchita+"\n"+intsanchita);
		
	}

}

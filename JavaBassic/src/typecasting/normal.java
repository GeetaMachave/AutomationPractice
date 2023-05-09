package typecasting;

public class normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  
 */
		int wax=7;
		int seven=wax;//implicit
		System.out.println(wax);
		System.out.println(seven);
		double myint=wax;//implicit widening =converting lower datatype into higher datatype by manually is known as inplicit widening
		double d=(double)wax;//explicit widening =converting lower datatype into higher datatype is called as explicit widening
		System.out.println(myint);
		System.out.println(d);
	}

}
class geeta{
	int pankii=16;
	int sanchita=pankii;//implicite 
 int sunita=(int)pankii;//explicite
 double ashok=pankii;//implicite widening
 double pandurang=(double)pankii;//explicite widening
 
 double salary=90000;
 int result=(int)salary;//narrowing explicite
 float result1 =(float)salary;
 
}
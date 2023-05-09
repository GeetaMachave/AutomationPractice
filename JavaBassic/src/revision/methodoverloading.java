package revision;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//when we declare a method more than once with different set of parameter is called as method overloading 
		//rules for method overloading 
		//difference in parameter 
		// diff in number of parameter 
		//diff in position of parameter 
		methodoverloading m1=new methodoverloading();
		m1.square(6.2f);
		m1.square(25);
		m1.square();
		
		
	}
 double res;
 public void square (double number) {
	res=number*number;
	System.out.println("method with double argument"+res);
	
}
 public void square (int number) {
	res=number*number;
	System.out.println(res);
	
}
 public void square () {
	int out=10*10;
	System.out.println("square is"+out);
}
}

package polymorphism;

public class Compiletime {
	//polymorphism means performing same acion in diffrent ways then it is called as polymorphism 
	//there are two types of polymorphism 
	//1 compile time and 2 runtime polymorphism 
	//1,it is aloso called as static binding ,early binding ,compile time binding 
	//when a method gets to know its implementation at athe time of compile time then it is called as compile time polymorphism 
	//compile time polymorphism can be achieved by using static method overloading
	
	static void sum(int num1) {
		int res=10+num1;
		System.out.println("addition of two numbers"+res);
	}
	static void sum(int num2,double num3) {
	 double res=(double) num2+num3;//explicite 
	 int result =(int)res;//explicite narrowing
	 System.out.println("addition of 3 numbers"+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletime.sum(23,56);
	}

}

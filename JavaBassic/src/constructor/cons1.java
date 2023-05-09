package constructor;

public class cons1 {
	cons1(){
		System.out.println("hi i am zero parameter constructor");
	}
  cons1(char c){
	System.out.println("hi i am char parameterised constructor");	
	}
  cons1(int a){
	  System.out.println("hi I am int constructor");
  }
  cons1(int b , int c){
	  System.out.println("diff in number of parameter with constructor overloading"+(b+c));
  }
  cons1(double d , int m){
	  System.out.println("hi i am double and int constructor"+(d/m));
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cons1 v1=new cons1('n');
cons1 b1=new cons1(2.3f,85);
cons1 j1=new cons1(20,30);
cons1 l1 = new cons1();
	}

}

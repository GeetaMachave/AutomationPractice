package abstractClass;
 abstract class geeta{//0%abstract class
	void delay() {
		System.out.println("non abstract method because it is not declared with abstract keyword,or also we can say complete method");
	}
	void result(){
		System.out.println("above class is called as 0% abstract class because no any method is declared with abstract keyword");
	}
}
 abstract  class  pankaj{//50%abstract class because one normal/regular and one abstract method is present in it
	 abstract public void relay();
	 void footage() {
		 System.out.println("non abstract method ");
		 System.out.println("above abstract class is 50% abstract class ");
	 }
 }
 abstract class sanchita{//100% abstract class because all methods are declared with abstract keyword
	 abstract void georgeous();
	 abstract int output();
	 abstract double soljer();
	 abstract public void school();
 }

public class abstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we can not make object of abstract class 
	}

}

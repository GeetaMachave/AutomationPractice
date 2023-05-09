package inheritance;
class parent{
	void relay() {
	System.out.println("i am relay method of parent class");	
	}
	
}//hierarchical inheritance
class vilas extends parent{
void result() {
System.out.println("i am result method of class vilas ");	
}
vilas(double d){
	double r=d;
	System.out.println(r);
System.out.println("i am constructor of vilas class");	
}
}
class sarika extends parent{
	sarika(int i){
	super();	
	}
void goods() {
	System.out.println("i am goods method of sarika");
}
}
public class hierarchiacal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in hierarchical inheritance we can access two classes properties which is involved in inheritance
		//if we create object of vilas we can access behaviour of parent and vilas
		vilas r1= new vilas(5);
		r1.result();
		r1.relay();
		sarika s1=new sarika(5);
		s1.goods();
		s1.relay();
		
		//r1.goods();
	}
}



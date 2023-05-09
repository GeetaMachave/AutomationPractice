package inheritance;
class p{
	
int age;
double goods;
p(){
	this(8);
	System.out.println("zero param constructor");
}
p(double j){
	double o=j;
	System.out.println(o);
}
void professsion(int age) {
	System.out.println("nonstatic method");
	this.age=age;
	System.out.println(age);
}
}
class q extends p{
	q(){
		super();
		System.out.println("zero parameter constructor of q class");
	}
	void relay() {
		System.out.println("nonstatic method of class q");
	}
	
}
class r extends q{
	r(){
		super();
	}
	void goods() {
		System.out.println("non statoc method of class r");
	}
}
public class multilelvelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
r k1 = new r();
k1.goods();
k1.relay();
p g1 =new p();



	}

}

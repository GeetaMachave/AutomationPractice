package holerevision;

public class exp6 {
	int age ;
	double hole;
exp6(){
	System.out.println("zero parameter constructor");
}
exp6(float r){
	this(4,102.2);
System.out.println("floating point constructor");	
}
exp6(int age,double hole){
	this.age=age;
	this.hole=hole;
System.out.println(age);	
System.out.println(hole);
System.out.println("i am integer and double type constructor");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp6 s1=new exp6();
s1.age=22;
exp6 f1=new exp6();
System.out.println(6.8f);
	}

}

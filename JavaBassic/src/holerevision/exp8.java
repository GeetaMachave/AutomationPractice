package holerevision;

public class exp8 {
	float dost=12;
	double friend=55;
	
exp8(double friend){
	this(45f,'m');
System.out.println("zero parameter constructor");	
this.friend=friend;
}
exp8(float q,char a){
	System.out.println("integer and character type constructor");
	dost=q;
}
void result() {
	this.friend=90;
	
	System.out.println(dost);
	System.out.println(friend);
}
	public static void main(String[] args) {
	exp8 n1=new exp8(3.5);
	n1.result();

		
	}

}

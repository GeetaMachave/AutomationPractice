package revision;

public class revise9 {
static double road=456;
int local =45;
double revision2;
revise9(int local ){
	this(5.2);
	local =local;
	System.out.println(local);
}
revise9(double road){
	this.road=road;
	System.out.println(road);
	this.revision2=road;
	System.out.println(revision2);
}
void result() {
	this.local=12;
	System.out.println(this.local);
	System.out.println(local+""+road);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
revise9 l1 = new revise9(5);
revise9 m1 = new revise9(1.1);

m1.result();
l1.result();


	}

}

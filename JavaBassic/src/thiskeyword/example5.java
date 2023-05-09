package thiskeyword;

public class example5 {
	int rollno;
	float fee;
example5(int rollno,float fee){
	this.rollno=rollno;
	this.fee=fee;
	
}
void display() {
	System.out.println(rollno+fee);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
example5 n1=new example5(56,96);
n1.display();

	}

}

package revision;

public class r11 {
int rollno;
float fee;
r11(int rollno){
	this(5,89);
	this.rollno=rollno;
	System.out.println("using this keyword value of rollno is "+rollno);
}
r11(float fee){
	this(2);
	this.fee=fee;
	System.out.println("using this keyword value of fee is"+fee);
	
}
r11(int rollno, float fee){
	System.out.println("i am int and float type constructor with this statement");
	
}
void display() {
	System.out.println("value os fee and rollno is:"+fee+""+rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r11 b1 = new r11(5/2);
		b1.display();
		r11 j1 = new r11(8);
		j1.display();
		
	}

}

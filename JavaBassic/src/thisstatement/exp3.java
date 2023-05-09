package thisstatement;

public class exp3 {
int rollno;
float fee;
exp3(int rollno){
this.rollno=rollno;	
}
exp3(int rollno,float fee){
this(rollno);
this.fee=fee;
}
void display() {
	System.out.println(rollno+" "+fee);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp3 h1 = new exp3(111);
h1.display();
exp3 j1 = new exp3(112,8900f);
j1.display();

	}

}

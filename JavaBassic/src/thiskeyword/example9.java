package thiskeyword;

public class example9 {
int x;
example9(int x){
this.x=x;
}
void display() {
	System.out.println("value of x is :"+x);
	System.out.println(this.x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
example9 b1= new example9(78);
b1.display();
	}

}

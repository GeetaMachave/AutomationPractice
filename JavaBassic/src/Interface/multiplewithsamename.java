package Interface;
interface pankaj{
static int age=2;
double salary=99;
void display();

}
class geeta implements pankaj{
	void donate() {
		System.out.println("blood donation is good ");
	}
	public void display() {
		System.out.println("non abstract method of class geeta");
	}
}
public class multiplewithsamename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 geeta w1=new geeta();
 w1.display();
 w1.donate();
 System.out.println(geeta.age);
 System.out.println(w1.salary);
	}

}

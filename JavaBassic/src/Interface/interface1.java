package Interface;
interface drawable{
	int salary =250000;
	void draw();
	
}
class rectangle implements drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle implements drawable{
	public void draw(){
		System.out.println("drawing circle");
	}
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle k1=new circle();
k1.draw();
drawable t1=new rectangle();
t1.draw();


	}

}

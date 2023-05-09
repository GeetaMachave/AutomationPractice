package Interface;
interface shailesh{
	int salary=56;//bydefault write public static final
	void animalsound();//bydefault public abstract
	void strawberry();
	
}
interface acceleration2{
	void colour();
}
class geeta2 implements shailesh{
public void animalsound() {
System.out.println("providing body to the animalsound method");	
}
public void strawberry() {
System.out.println("providing body to the strawberry method");	
}
}
class amol extends geeta2 implements acceleration2{
	public void colour() {
	System.out.println("providing body to colour method");	
	}
}
public class interface23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
amol p1=new amol();
p1.animalsound();
p1.strawberry();
p1.colour();
geeta2 o1=new geeta2();
o1.strawberry();
o1.animalsound();
	}

}

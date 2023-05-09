package inheritance;
class a{
	static int more() {
		System.out.println();
		return 5;
	}
	int x=90;
	double salary=45;
	
}
class b extends a{
int r=88;

}
class c extends b{
	double value =77;
}
public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c r1=new c();
System.out.println(r1.r+" "+r1.value+" "+r1.x+" "+r1.salary);
	}

}

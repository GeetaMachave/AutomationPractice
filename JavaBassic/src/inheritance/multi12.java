package inheritance;
class a2{
	static long l=10;
a2(long l){
	this(55d);
	this.l=l;
	System.out.println(l);
System.out.println("constructor of class a with long parameter");	
}
a2(double d){
System.out.println("double parameter constructor");	
}
int remark() {
	System.out.println("nonstatic method of class a with returntype integer");
	return 3;
}
}
class b2 extends a2{
	b2(){
		super(23);
		System.out.println("constructor of class b ");
	}
	 static int salary=10;
	void calling() {
		System.out.println("using super keyword");
	}
	
	
}
class c2 extends b2{
	static int salary=188;
	void calling() {
		System.out.println("method of class c");
	}
	
	void got() {
		System.out.println(super.salary);
		System.out.println(salary);
		super.calling();
		calling();
		
	}
}
public class multi12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c2 h1= new c2();
h1.got();
	}

}

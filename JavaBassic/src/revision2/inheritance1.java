package revision2;
class vilas{
	float red=89f;
	vilas(int i){
		this(25f);
	System.out.println("constructor chaaining using this statement");	
	}
	vilas(float red){
	this.red=red;
	System.out.println(red);
	System.out.println("constructor of vilas class");
	}
	
}
public class inheritance1 extends vilas {
	inheritance1(){
	super(25);
	System.out.println("inheritance is achieved by using constructor chaining");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		inheritance1 t1=new inheritance1();
		
	}

}

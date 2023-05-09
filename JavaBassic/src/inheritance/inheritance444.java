package inheritance;
class x{
	int horse=90;
	int gaffar() {
		System.out.println("nonsttaic method of class x ");
		return 5;
	}
}
class y extends x{
	void julfekhar() {
		System.out.println("nonstatic method of julfekhar");
	}
	
}

public class inheritance444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		y t2=new y();
		t2.julfekhar();
		t2.gaffar();
		//two ways to access property and behaviour return back 
		//x g1=t2 or x g1=new y();
		x g1=t2 ;
		g1.gaffar();
	}

}

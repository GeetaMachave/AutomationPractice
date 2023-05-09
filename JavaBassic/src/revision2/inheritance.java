package revision2;

class sanchi {
	int age;
	
	sanchi(int age){
		this('m');
		System.out.println("constructor of sanchi");
		this.age=age;
		
	}
	sanchi(char v){
	System.out.println("constructor chaining");	
	}

void relay() {
	this.age=45;
	System.out.println();
}
}
class panki extends sanchi{
	panki(){
	super(5);	
	}
	void relay(){
		System.out.println("nonstatic method of class panki");
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
panki g1=new panki();
	}

}

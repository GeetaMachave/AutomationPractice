package holerevision;

public class exp5 {
	int revision;
	double all;
	exp5(){
		this(2.2f);
		revision=12;
		all=67;
		System.out.println("constructor chaining");
	}
	exp5(float f){
		this(8);
		System.out.println("calling floating point constructor using constructor chaining");
	}
	exp5(int i){
		System.out.println("calling integer constructor using this statement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exp5 j1=new exp5();

	}

}

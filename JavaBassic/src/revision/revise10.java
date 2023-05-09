package revision;

public class revise10 {
	revise10(){

		
		
	System.out.println("i am zero parameter constructor");	
	}
	revise10(float v){
		System.out.println("i am float type parameter constructor");
	}
	revise10(double l){
		this(4);
	System.out.println("i am double type parameter constructor");	
	}
	revise10(int sop){
		this();
		
		System.out.println("i am integer type parameter constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
revise10 h1 = new revise10(5.3);
	}

}

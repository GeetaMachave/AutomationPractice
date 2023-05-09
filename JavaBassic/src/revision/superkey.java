package revision;
class digvijay {
	static int load =85;
	static void dumper() {
		System.out.println("static method of class digvijay");
	}
	digvijay(int y){
	System.out.println("integer parameter constructor");	
	}
	
}

public class superkey extends digvijay {
	superkey(){
	super(8);
	System.out.println("zero paramter constructor");
	}
class geeta extends superkey{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
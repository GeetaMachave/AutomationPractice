package overriding;
class puri{
	void sunita(){
		System.out.println("method of class puri ");
	}
}
class pani extends puri{
	void sunita() {
		System.out.println("method of class pani");
	}
}
public class exp4 {
	public static void main() {
		puri o1=new puri();
		o1.sunita();
		
	}

}

package predefinedclassobjectclass;
class kalavati {
	public int hashCode() {
		return 53;
	}
	
}

public class exp5 extends kalavati {
	public String toString() {
		return "Now we are suppose to start selenium";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp5 g1=new exp5();
		System.out.println(g1);
		System.out.println(g1.hashCode());
		System.out.println(g1.toString());
		kalavati o1=new kalavati();
		System.out.println(o1);
		
		
	}

}

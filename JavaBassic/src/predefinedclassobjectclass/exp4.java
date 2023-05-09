package predefinedclassobjectclass;
class sanchita{
	void relay() {
	System.out.println("relay method of class sanchita");	
	}
	public int hashCode() {
	return 120;	
	}
	public String toString() {
		return "BasicCoreJava";
	}
}
public class exp4 extends sanchita{
	
 void relay() {
	 System.out.println("overrided relay  method in exp4 class");
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sanchita l1=new sanchita();
		System.out.println(l1);
		System.out.println(l1.hashCode());
		System.out.println(new sanchita());
		System.out.println(l1.toString());
		exp4 o1=new exp4();
		System.out.println(o1);
		o1.relay();
		
	}

}

package overriding;
class dosa{
	
void relay() {	
System.out.println("relay method of dosa class");	
}
void relay(int i){
System.out.println("overloading with parametr integer");	
}
void relay(double d) {
	System.out.println("overloading with double parameter");
}
}
class panipuri extends dosa {
void relay() {
System.out.println("relay method of panipuri class");	
}
public void shape() {
	super.relay();
	relay();
}
}

public class override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
panipuri o1=new panipuri();
o1.relay();
o1.relay(12.3);
o1.relay(2);

	}

}

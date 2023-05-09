package modifiers;

public class exp1 {
	private int accnum=78;
	int login=90;
	private void relay() {
		System.out.println(accnum);
	}
	
public static void main(String[] args) {
	exp1 n1=new exp1();
	System.out.println(n1.accnum);
	n1.relay();
}
}
class accessprivatemembers{
	public static void main() {
		exp1 k1=new exp1();
		System.out.println(k1.login);
		System.out.println(k1.accnum);
		k1.relay();
	}
}
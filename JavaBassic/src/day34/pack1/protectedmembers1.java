package day34.pack1;

public class protectedmembers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectedmembers j1=new protectedmembers();
		System.out.println(j1.value);//default nonstatic global variable
		System.out.println(protectedmembers.loan);//protected static global variable
		
		j1.skilled();
		j1.display();
	}

}

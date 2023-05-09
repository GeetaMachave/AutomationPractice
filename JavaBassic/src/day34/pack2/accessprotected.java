package day34.pack2;
import day34.pack1.protectedmembers;

public class accessprotected extends protectedmembers{
public static void main(String[] args) {

	accessprotected j1=new accessprotected();
	System.out.println("accessing protected members outside the package using import statement with using inheritance");
	System.out.println(j1.loan);
	j1.display();
	
}
}

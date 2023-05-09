package revision;

public class Allprogram {
double salary=36000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
double q=56;
System.out.println("we are printing addition result on console"+a+q);
//to access nonstatic variable we have to create instance
Allprogram n1= new Allprogram();
System.out.println("Printing nonstatic variable"+n1.salary);
Allprogram n3= new Allprogram();
System.out.println("creating second variable"+n3.salary);
	}

}

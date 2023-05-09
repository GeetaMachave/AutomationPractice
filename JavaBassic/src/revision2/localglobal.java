package revision2;

public class localglobal {
int age ;
double salary;
static char charvariable='a';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=12;
float out=23.21f;
double num4=36d;
char charvariable='A';
byte bytevariable=4;
short shortvariable=56;
long longvariable=88;
localglobal n1=new localglobal();
System.out.println("printing non static global variable :"+n1.age);
System.out.println("printing nonstatic global variable salary :"+n1.salary);
System.out.println(num1+out);
System.out.println("we can access static variable of particular class using directly "+charvariable);
System.out.println(localglobal.charvariable);//with  standard

System.out.println("accessing panaj class ka static variable"+pankaj.floatvar);		
sanchita v1=new sanchita();
v1.calling();
pankaj j1=new pankaj();
j1.display();

		
		
	}

}
class pankaj {
	int num4=65;
	static float floatvar=86f;
	public static void display(){
	System.out.println("I am geeta");	
	System.out.println("I completed my BE");
		
	}
}
class sanchita{
	void calling() {
		System.out.println("we are accessing another class static and non static members");
	}
}
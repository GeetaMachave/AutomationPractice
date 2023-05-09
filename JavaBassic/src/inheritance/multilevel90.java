package inheritance;
class dog{
	static double s;
	dog(double s){
		this(4);
		this.s=s;
		
	System.out.println("double parameter constructor");	
	}
	dog(int i){
	System.out.println("integer parameter constructor");	
	}
void barking() {
System.out.println("dog is barking");	
this.s=11;
System.out.println(s);
}
}
class bird extends dog{
	bird (){
		super(8);
	}
	int salary;
void jamin() {
	System.out.println("birds are flying");
}
}
class zoo extends bird{
	int salary=44;
	
void outing() {
	System.out.println(super.salary);
	System.out.println(salary);
	System.out.println("zoo is far away from collage");
}
}
public class multilevel90 {

	public static void main(String[] args) {
	
		
		
		// TODO Auto-generated method stub
//above examplw is multilevel inheritance 
		//if we creat objct of zoo class we can acceess all the members of dog and bird 
		zoo j1=new zoo();
		j1.outing();
		j1.jamin();
		j1.barking();
		//if incase we want to return particular object behaviour we have to keep that object reference 
		//and object of inherited clas
		dog o1=new zoo();
		o1.barking();
	}

}

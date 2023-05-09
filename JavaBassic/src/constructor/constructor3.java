package constructor;

public class constructor3 {
	int age;
	constructor3(int a){
	age=a;	
	}
}
class geeta{
public static void main() {
	constructor3 n1=new constructor3(36);
	System.out.println(n1.age);
	n1.age=85;
	System.out.println(n1.age);
	constructor3 u1= new constructor3(96);
	System.out.println(u1.age);
}

}
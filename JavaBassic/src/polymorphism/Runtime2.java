package polymorphism;
class hillstation {
	void location() {
		System.out.println("location is:");
	}
	void famousfor() {
		System.out.println("famous for:");
	}
}
class manali extends hillstation {
	void location() {
		System.out.println("manali is in himachal pradesh ");
	}
	void famousfor() {
		System.out.println("it is famous for hidimba temple and adventure sports");
	}
}
class mussorie extends hillstation{
	void location() {
		System.out.println("mussorie is in uttarakhand ");
	}
	void famousfor() {
		System.out.println("it is famous for education institution");
	}
}
public class Runtime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when a method gets to know its inplementation at the time of execution is known as runtime polymorphism 
		//to achieve runtime polymorphism we need inheritance , upcasting, , overriding 
		hillstation k1=new hillstation();
		k1.location();
		k1.famousfor();
		hillstation u1=new manali();
		u1.famousfor();
		u1.location();
		mussorie o1=(mussorie)k1;//explicite downcasting
		o1.location();
		o1.famousfor();
		
	}
}

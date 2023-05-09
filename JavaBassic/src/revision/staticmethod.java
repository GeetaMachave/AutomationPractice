package revision;

public class staticmethod {
static int var=25;
double vari=23;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int tom=25;
    pankii.anothermethod();
pankii.calling (250);
pankii.anothermethod();
System.out.println(staticmethod.var);
pankii.othermethod("madhuri","software testing","pune");
System.out.println(pankii.addtwonumber(10,20));
int res=pankii.addtwonumber(10,20);
int finalvalue=res+200;
System.out.println("final value after adding into result is"+finalvalue);
	}

public class pankii{	
	
static public void anothermethod() {
		System.out.println("good morning ");
		System.out.println("im geeta ");
		System.out.println("my automation mentor is shailesh sir ");
		System.out.println("static global variable"+var);
		staticmethod n1=new staticmethod();
		System.out.println("nonstatic variable with standard"+n1.var);
	}
	public static void calling (int num) {
	System.out.println("calling static method with one parameter"+num); 	
	}
	
	static void othermethod(String prof,String name,String location ) {
	System.out.println("my name is "+name);
	System.out.println("i am leaarning"+prof);
	System.out.println("i am from "+location);
	
	}
	static int addtwonumber(int num3, int num6) {
		System.out.println("addition of two number is performing here using integer returntype");
		System.out.println("first number is"+num3);
		System.out.println("second number is"+num6);
		int res=num3+num6;
		System.out.println("result is"+res);
		return res;
		
	}
}
}
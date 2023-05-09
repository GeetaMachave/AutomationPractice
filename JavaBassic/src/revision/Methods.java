package revision;

public class Methods {
static double d=45;
int a=25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=25;
		Display();
		Display();
		Methods.Display();
		deptnum(23);
		deptnum(22);
		Methods.deptnum(15);
		DisplayPersonalInfo("geeta","QA tester","pune");
		DisplayPersonalInfo("sanchita","12th student","ambajogai");
		test(25);
		int a=25000;
		test(a);
		
	}	
		static void Display() {
			System.out.println("accessing static variable"+d);
			System.out.println("my name is geeta");
			Methods n1 = new Methods();
			System.out.println(n1.a);
		}
		public static void deptnum(int a) {
			System.out.println("i completed my be in instrumentation and control ");
			System.out.println("also i completed my plc programmer course from symboisis skills and professional university pune ");
			System.out.println("program ends");
		}
		static void test (int num) {
			System.out.println("giving return value"+num);
		}

		public static void DisplayPersonalInfo(String name,String prof,String location ) {
			System.out.println("my name is :"+name);
		System.out.println("my peofession is : "+prof);
		System.out.println("i am from "+location);
		}
	}

public class mockpractice
{
 int salary=52000;//nonstatic global variable
static double result=63.0;// static global variable 
	
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int age=56;//local variable declaration
System.out.println(age);
System.out.println("printing static global variable"+result);
System.out.println(result);
System.out.println("with standard printing global variable :"+mockpractice.result);
mockpractice a=new mockpractice();//classname ref variable=new mockpractice();
System.out.println("printing nonstatic global variable"+a.salary);
System.out.println("updated result value : "+result);
System.out.println("updated salary value : "+a.salary);
//display(02,02);
//display(1,8);
display(8,12);
display(12,2.1f);
//a.test();
mockpractice v1=new mockpractice();
v1.test();
	}


static void display(int num1,int num2) {
	/*System.out.println("todays mockmember is amol,manohar,shweta,geeta,harbhajan,amol2");
	System.out.println("todays mockmember is amol,manohar,shweta,geeta,harbhajan,amol2");
	System.out.println("todays mockmember is amol,manohar,shweta,geeta,harbhajan,amol2");
	System.out.println("todays mockmember is amol,manohar,shweta,geeta,harbhajan,amol2");
	System.out.println("todays mockmember is amol,manohar,shweta,geeta,harbhajan,amol2");
	System.out.println("todays mockmember is amol,manohar,shweta,geeta,harbhajan,amol2");
	*/
	int num3=num1+num2;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	return;
}
static void display(int num4,double num5) {
	System.out.println("methodoverloading");
	double num6=num4+num5;
	System.out.println(num6);
}
void test() {
	System.out.println("non static method ");
	System.out.println("non static method ");
	System.out.println("non static method ");
	System.out.println("non static method ");
	System.out.println("non static method ");
}
}







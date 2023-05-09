package revision;

public class method {
int age ;
int num3;
static double salary =63.333;
static int out=89;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=96;
System.out.println("printing local variable num whose value is :"+num);
System.out.println("printing static global variable salary whose value is :" +salary);
System.out.println("with stndard global variable is pprinting :"+method.out);
System.out.println("****************************");
//to print nonstatic variable we require to creat object
//syntax to creat object is classname ref variable = new classname ();
method n1 = new method ();
method n2= new method ();
System.out.println("pring nonstatic variable through object: "+n1.age);
System.out.println("addition of nonstatic variable :"+(n1.age+n2.num3));
System.out.println("subtraction of nonstatic variable :"+(n1.age-n2.num3));
n1.age=53;
n2.num3=96;
System.out.println("updated values operation"+(n1.age+n2.num3));
System.out.println(+n1.age);
method n3 =new method();
System.out.println("accessing nonstatic variable with new object :"+n3.age);

	}

}

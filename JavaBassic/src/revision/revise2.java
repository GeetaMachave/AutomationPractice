package revision;

public class revise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program starts");
double res=simpleinterest(10000,0.15,2);
System.out.println(res);
double result =dtof(88);
System.out.println(result);
double area = areaofcircle(10);
System.out.println(area);
	}
	
	
static double simpleinterest(double a,double rate,int time) 
{
	System.out.println("calculating simple interest using method");
	double interest=a*rate*time;
	System.out.println("the amount a"+a+"at the rate os"+rate+"for"+time+"years\n\n");
	return interest;
}


static double dtof(double degreecelcius)
{
	System.out.println("calculating dtof");
	double res=(degreecelcius+1.8)+32;
	System.out.println(res);
	System.out.println("program ends \n\n");
	return res;
	
	
}
static double areaofcircle(double radius) {
	double PI=3.14;
	double area=PI*radius*radius;
	System.out.println(area);
	System.out.println("program ends \n\n");
	return area;
}
}

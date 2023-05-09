package revisionbeforeoops;

public class cloading {
int num3=56;
double salary= 45;

cloading()
{
	System.out.println("zero parameter constructor");
}
cloading (int num3)
{
	System.out.println(num3);
}
cloading(double salary,int num3)
{
	salary=salary;
	num3=num3;
	System.out.println(salary+num3);

}


	public static void main(String[] args) {
		cloading n1=new cloading(56,88);
		cloading p1=new cloading(22);
		cloading s1=new cloading();
	
	}
}


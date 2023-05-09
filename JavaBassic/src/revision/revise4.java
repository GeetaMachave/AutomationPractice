package revision;

public class revise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
square();
square(99,88);
square(4,6,7);
square(7,6);
	}
static void square() {
	int num1=10,num2=56;
	int res =num1+num2;
	System.out.println(res);
}
static void square(int a,int b) {
	int result = a*b;
	System.out.println(result);	
}
static void square(float a,float b) {
	double out =a*b;
	System.out.println(out);
}
static void square(int v,int m,int j) {
	int sop = v*m*j;
	System.out.println(sop);
	
}
}

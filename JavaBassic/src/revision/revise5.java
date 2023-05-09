package revision;

public class revise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revise5 n1=new revise5();
n1.display('i');
n1.display(88,66);
n1.display(77,33,66);
System.out.println(n1.display('i'));
System.out.println(n1.display(88,66));
System.out.println(n1.display(77,33,66));
	}
	int display(char c) {
		System.out.println(c);
		char d='a';
		return d;
	}
	double display (double k,int num1,float c) {
		double result=k*num1*c;
		System.out.println(result);
		return result;
		
	}
	int display(int g,int r){
	int sos=g+r;
	System.out.println(sos);
	return sos;
	}
	

}

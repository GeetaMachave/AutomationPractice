package arrays;

public class SingleDimentional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] getarray=new char[] {'d','m','n','k'};
		//also we can declare char[] getarray=new getarray[4];or 
		//char[] getarray={'d','m','n','k'};
		System.out.println(getarray[3]);
		System.out.println(getarray[2]);
		System.out.println(getarray[1]);
		System.out.println(getarray[0]);
	System.out.println(getarray.length);
	
	for(int i=0;i<getarray.length;i++) {
		System.out.print(getarray[i]);
	}
	for(char c:getarray) {
		System.out.print(c);
	}
	System.out.println();
	double[] run =new double[3];
	run[0]=8912;
	run[1]=11;
	run[2]=77;
	System.out.println(run.length);
	for(int h=0;h<run.length;h++) {
	System.out.println(run[h]);	
	}
	for(double doublevariable:run) {
		System.out.println(doublevariable);
	}
	}
}

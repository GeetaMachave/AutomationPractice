package arrays;

public class SingleDimentional3 {
public static void main(String[] args) {
	double[] soldering=new double[] {7,89,45,12};
	System.out.println(soldering[3]);
	System.out.println(soldering[2]);
	System.out.println(soldering[1]);
	System.out.println(soldering[0]);
	System.out.println(soldering.length);
	for(int i=0;i<soldering.length;i++) {
		System.out.println(soldering[i]);
		if(soldering[i]==45) {
			System.out.println(soldering[i]);
			break;
		}else {
			System.out.println("given number is not 45");
		}
	}
	for(double r:soldering){
		System.out.println(r);
		if(r==12){
			System.out.println(r);
			break ;
		}else {
			System.out.println("given number is not 12");
		}
		
	}
}
}

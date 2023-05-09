package arrays;

public class SingleDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first way to declare and initialize array
		int[] num = new int[4];
		
		System.out.println(num[3]);
		System.out.println(num[2]);
		System.out.println(num[1]);
		System.out.println(num[0]);
		num[0]=45;
		System.out.println(num[0]);
		System.out.println(num.length);
		//second way to declare and initialize array 
		double[] num1= {45,56,89};
		System.out.println(num1[2]);
		System.out.println(num1[1]);
		System.out.println(num1[0]);
		System.out.println(num1.length);
		
		//normal for loop
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(int j=1;j<num1.length;j++) {
			System.out.println(num1[j]);
		}
		for(int a:num) {
			System.out.println(a);
			
		}
		
			}

}

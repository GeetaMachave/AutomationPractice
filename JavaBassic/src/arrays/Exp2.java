package arrays;

public class Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []a=new int[5];
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	a[2]=56;//index out of bond expansion because we declared an array of 4th index last 
	System.out.println(a[2]);
	a[5]=8;//index out of bond expansion because we declared an array of 4th index last
	System.out.println(a[5]);
	System.out.println(a[2]);
	//to count elements in array we use arrays.length
	System.out.println(a.length);
	/*for(int i=0;i<a.length;i++);
	{
		System.out.println(a[i]);
	}
	*/
	
	for(int num:a) {
	System.out.println(num);	
	}
	}

}

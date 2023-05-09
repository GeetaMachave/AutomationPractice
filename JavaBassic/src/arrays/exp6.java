package arrays;
 class exp6 {
	static int[] getarray() {
		int num[]=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		return new int[] {10,50,60,30};
	}
	public class array63{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=exp6.getarray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}	
	}
	}
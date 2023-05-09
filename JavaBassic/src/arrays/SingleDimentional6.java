package arrays;
class testarray2{
	//we can use array as a parameter and also use as a returntype of method
	static void min(int arr[]) {
		
		int min=arr[0];
		for(int i=1 ; i<arr.length;i++) {
			if(min>arr[1]) {//33>13!13>4!4>50!4>1
				min=arr[i];
			}
			
		}
		System.out.println(min);
	}
	static void max(int arr[]) {
		int max =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
			
		}
		System.out.println(max);
	}
}
public class SingleDimentional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {33,13,4,50,15,1};
		testarray2.min(a);
		testarray2.max(a
				);
	}

}

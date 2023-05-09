package predefinedclassarrays;
import java.util.Arrays;
public class exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {44,55,66,33,22,11};
		System.out.println("printing original array length"+array.length);
		for(int num1:array) {
			System.out.println(num1);
		}
		int[] clonearray=array.clone();
		for(int num2:clonearray) {
		System.out.println(num2);	
		}
		System.out.println("check original array and clonearray elements are equal or not using Arrays.equals() method");
		System.out.println("array and clonearray elements validation  "+Arrays.equals(array, clonearray));
		int[] newcopiedarray=Arrays.copyOf(array,4);
		for(int num3:newcopiedarray) {
		System.out.println(num3);	
		}
		int[] newcopiedrangearray=Arrays.copyOfRange(array, 2, 6);
		for(int num4:newcopiedrangearray) {
		System.out.println(num4);	
		System.out.println("checking equals elemnts using equals method of arrays class   "+Arrays.equals(newcopiedarray,newcopiedrangearray));
		System.out.println("**************************");
		
		
		
		}
	}

}

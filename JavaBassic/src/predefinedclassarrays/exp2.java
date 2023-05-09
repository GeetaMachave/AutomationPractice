package predefinedclassarrays;

import java.util.Arrays;

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] copyFrom= {100,200,300,400,500,600};
		System.out.println("printing elements in copyfrom array"+copyFrom.length);
		for(int print:copyFrom) {
			System.out.println(print);
		}
		int[] copyTo=Arrays.copyOf(copyFrom, copyFrom.length);
		System.out.println(copyTo[0]+""+copyTo[3]+""+copyTo[4]);
		for(int i=0;i<copyTo.length;i++) {
		System.out.println(copyTo[i]);	
		}
		int[] copywithrange=Arrays.copyOfRange(copyFrom, 3, 5);
		for(int test1:copywithrange) {
		System.out.println(test1);	
		}
		System.out.println("printing elements after sorting");
		Arrays.sort(copywithrange);
		for(int tets2:copywithrange) {
		System.out.println(tets2);	
		}
		Arrays.sort(copyTo);
		for(int test3:copyTo) {
		System.out.println(test3);	
		}
	}

}

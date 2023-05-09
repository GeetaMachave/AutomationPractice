package predefinedclassarrays;
import java.util.Arrays;
public class ownexp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a source array
				char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
				System.out.println("ELements count in copyFrom array: "+copyFrom.length);
				
		char[] copyto=Arrays.copyOf(copyFrom, 5);
		System.out.println("copying elements of copyto array from copyfrom array of element  "+copyto.length);
		for(int i=0;i<copyto.length;i++) {
		System.out.print(copyto[i]);	
		}
		System.out.println();
		System.out.println("copy elements using copyofrange method");
		 char[] copywithrange=Arrays.copyOfRange(copyFrom, 5, copyFrom.length);
		 System.out.println("printing elements using copyofrange method of predefined arrays class"+copywithrange.length);
		 for(int j=0;j<copywithrange.length;j++) {
			System.out.print(copywithrange[j]); 
		 }
		 System.out.println();
	System.out.println("after sorting");
	Arrays.sort(copyFrom);
	System.out.println();
	for(char load:copyFrom) {
		System.out.print(load);
	}
	Arrays.sort(copyto);//sort method of arrays class are used to arrange characters in asending order
	System.out.println();
	for(char loading :copyto) {
	System.out.print(loading);	
	}
	Arrays.sort(copywithrange);
	System.out.println();
	for(char test:copywithrange) {
	System.out.print(test);	
	}
	}

}

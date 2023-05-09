package predefinedclassarrays;
import java.util.Arrays;
public class exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] orgarray= {'m','n','b','b','v','x','z'};
		System.out.println("pring length of orgarray"+orgarray.length);
		for(char num1:orgarray) {
		System.out.print(num1);	
		}
		char[] clonearray=orgarray.clone();
		for(char num2:clonearray) {
		System.out.print(num2);	
		}
		System.out.println("****checkingboth array are equal or not****    "+Arrays.equals(orgarray, clonearray));
		boolean result=Arrays.equals(orgarray, clonearray);
		System.out.println(result);
		
	}

}

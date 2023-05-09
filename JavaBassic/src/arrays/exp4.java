package arrays;

public class exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {100,200,300,400};
		System.out.println("accessing elements in array");
		System.out.println(age[3]);
		System.out.println(age[2]);
		System.out.println(age[1]);
		System.out.println(age.length);
		for(int i=0;i<age.length;i++) {
		System.out.println(age[i]);	
		if(age[i]==200) {
		System.out.println();
		}
		else {
			System.out.println("age is not 200");
		}
		}
		for(int rename:age) {
			System.out.println(rename);
			
		}
	}

}

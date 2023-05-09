package arrays;

public class SingleDimentional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {12,4,25,2,5};
		//access each array elements
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		System.out.println(age.length);//length is the property of array
		System.out.println("using for loop");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
			if(age[i]==25) {
				System.out.println(age[i]);
				break;
			}else {
				System.out.println("age is not 25");
			}
		}
		System.out.println("using enhanced for loop");
		for(int second:age) {
			System.out.println(second);
		}
	}

}

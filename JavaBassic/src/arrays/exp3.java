package arrays;

public class exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] sanchu=new char[8];
		System.out.println(sanchu[6]);
		System.out.println(sanchu.length);
		System.out.println(sanchu[2]);
		System.out.println(sanchu[1]);
		sanchu[7]=89;
		System.out.println(sanchu[7]);
		sanchu[6]='u';
		System.out.println(sanchu[6]);
		for(char p:sanchu) {
		System.out.println(p);	
		}

	}

}

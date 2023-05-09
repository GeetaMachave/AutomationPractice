package day18.ifstatement;

class usingonecondition{
	public class ifLadderForvowel {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	char c1='o';
	if(c1=='a') {
		System.out.println("vowel is : a");
	}
	else if (c1=='e') {
		System.out.println("vowel is :e");
	}
	else if (c1=='i') {
		System.out.println("vowel is : i");
	}
	else if (c1=='o') {
		System.out.println("vowel is;o");
	}
	else {
		System.out.println("vowel is u");
	}
	}
		}

	public static void main(String[] args) {
		char c='o';
		if(c!='o') {
			System.out.println("o is not a vowel");
		}
		else {
			System.out.println("o is vowel");
		}
	}
}
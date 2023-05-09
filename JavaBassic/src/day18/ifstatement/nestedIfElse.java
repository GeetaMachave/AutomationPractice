package day18.ifstatement;

public class nestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=15;
int weight=55;
if(age>=18) {
	System.out.println("you are eligible to donate blood");
}
if(weight>50) {
	System.out.println("you are not eligible to donate blood");
}
else {
	System.out.println("you are not eligible to donate blood");
}
System.out.println("you are not eligible to donate blood");
	}
}

class anothermethodforthis {
	public static void main (String[] args) {
		int age=15;
		int weight=45;
if(age>=18) {
		if(weight>50) {
			System.out.println("you are  eligible to donate blood");
		}
		else {
			System.out.println("you are not eligible to donate blood");
	    }	
}
else {
	System.out.println("not able to donate");
}
}
}
package day19.whileLoop;

public class whilwLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//while loop
		/*
		 * while loop is working on condition based
		 * syntax to initialize while loop
		 * while(condition){
		 * 
		 * }
		 * 
		 * if condition is true then it will execute the body 
		 * if condition is false it will not execute the body
		 * 
		 * 
		 * when you are not sure about the no.of iteration but you know the condition then you can loop this block in while loop and
		 * it will execute until the condition is true once condition get false it terminate.
		 * 
		 * */
int i=0;
	// TODO Auto-generated constructor stub
	System.out.println("printing  numbers from 0 to 10");
	while(i<=10) {//because of this condition loop act infinite loop
		System.out.println(i);
	i++;
	}
	char d='a';
	System.out.println("printing character from a to z");
	while(d<='z') {
		System.out.println(d);
		d++;
	}
	int c=98;
	System.out.println("printing reverse number from 98 to 85");
	while(c>=85) {
		System.out.println(c);
		c--;//we can perform all functions of for loop using while loop 
	}
	int p=20;
	System.out.println("calcutating even number from 20 to 40");
	while(p<=40) {
	
	if(p%2==0) {
		System.out.println(p);
		p++;
	}
}
}
}


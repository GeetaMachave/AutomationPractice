package day18.ForLoop;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i<10 means below 10 not ten    and i<=10 means ten included
		System.out.println("printing 1 to 10 numbers");
for(int i=0;i<=10;i++) {
	System.out.println(i);
}
System.out.println("printing one statement 8 times");
for(int i=1;i<=9;i++) {
	System.out.println("good morning");
}
System.out.println("printing reverse number from 10 to 1");
for(int i=10;i>=1;i--) {
	System.out.println(i);
}
System.out.println("printing numbers between 45 to 98");
for(int i=45;i<=98;i++) {
	System.out.println(i);
}
System.out.println("checking even or odd number between 10to 20");
for(int i=10;i<=20;i++){
if(i%2==0)	{
	System.out.println("number is even");
}
System.out.println("number is odd");
}
for(char c='a';c<='z';c++) {
	System.out.print(c);
}
for(char c='z';c>='a';c--) {
	System.out.print(c);
}
for(char c1='Z';c1>='A';c1--) {
System.out.print(c1);	
}
for(char c1='A';c1<='Z';c1++) {
	System.out.print("c1");
}
	}

}

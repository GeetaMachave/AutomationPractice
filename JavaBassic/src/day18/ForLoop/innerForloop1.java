package day18.ForLoop;

public class innerForloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(double d=0;d<12;d++) {
	System.out.println("declared double variable is printed 12 times");
}
for (int i=11;i<16;i++) {
	System.out.println("hello i"+i);
	for(int d=0;d<=6;d++) {
		System.out.println("by d"+d);
	}
}
System.out.println("********************************************************");
for(float f=10f;f>=1;f--) {
	System.out.println("reverse value from 10 to 1 is printed here");
	for(char c='a';c<='e';c++) {
		System.out.println("for loop is declared inside another loop then it is called as inner for loop"+c);
		for(int i=5;i<=10;i++) {
			System.out.println("hiiiiiiiiiiiii     iiiiiiiiii"+i);
		}
	}
}
}
}
//inner for loop program
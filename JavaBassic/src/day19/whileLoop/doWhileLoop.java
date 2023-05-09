package day19.whileLoop;

public class doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=10;i<=30;i++) {
	if(i%2==0)
		System.out.println(i);//printing even number between 10 to 30
}
int d=20;
while(d<=40) {
	if(d%2!=0)
	System.out.println("odd number betwwn 20 to 40 is :"+d);
	d++;
}
//above program is used for practice
int q=10;
do {
	System.out.println(q);
	q++;
}while(q<=20);

int e=20;
do {
	System.out.println(e);
}while(e>=60);

}
}
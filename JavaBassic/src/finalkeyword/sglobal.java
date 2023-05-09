package finalkeyword;

public class sglobal {
	static int age =25;
public static void main(String [] args) {
	int age=35;
	System.out.println("local variable"+age);
	System.out.println("global variable :"+sglobal.age);//when we have static global variable and local variable name same in that case we have to go with standard
}
}

package finalkeyword;

public class finalkeyword1 {
	final int empid=90;
	double salary=54000;
	void test() {
		System.out.println("empid:"+empid);
	}

public static void main (String [] args) {
	finalkeyword1 obj =new finalkeyword1();
	System.out.println(obj.salary);
	obj.test();
	}
}

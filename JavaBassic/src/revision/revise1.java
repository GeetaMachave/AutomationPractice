package revision;

public class revise1 {
	static float picture=87;
	double salary = 45000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("sgv "+picture);
    revise1 k1=new revise1();
    System.out.println(k1.salary);
    student();
    System.out.println(test());
    test();
    int local= test();
    local=test()+45;
    System.out.println(local);
    revise1 v1=new revise1();
    v1.test1("geeta","be","pune");
    System.out.println(v1.test1("sangita","pankii","sanchii"));
    char d;
    d=v1.salary();
    
    v1.salary();
    
	}
	public static void student() {
		System.out.println("i am static student method");
	}
	static public int test() {
		System.out.println("static method with returntype integer");
		int star=88;
		System.out.println(star);
		return star;
	}
	 int test1(String location,String prof, String education){
		 System.out.println("my name is :"+location);
		 System.out.println("i completed "+education);
		 System.out.println("i am from"+prof);
		int res=0;
		return res;
	}
char salary() {
	System.out.println("i am nonstatic method with char returntype");
    char a='d';
	return a;
}
}

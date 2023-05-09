package inheritance;
class fruit{
	int fruitage;
	fruit(){
		System.out.println("fruit class constructor");
		fruitage=7;
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
class orange extends fruit{
	int fruitage;
	orange(){
		System.out.println("orange class constructor");
		fruitage=5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruitage:"+fruitage);
		System.out.println(super.fruitage);
		taste();
		super.taste();
	}
}

public class superkeyword {
public static void main(String[] args) {
	orange o1 = new orange();
	o1.shape();
}
}

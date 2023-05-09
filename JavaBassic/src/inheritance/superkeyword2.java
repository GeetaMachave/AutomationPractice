package inheritance;
class key{
	int circle;
	key(){
		System.out.println("constructor of key class");
		circle=78;
	}
		void taste(){
			System.out.println("key class method");
		}
	}

	class monitor{
		int circle;
		monitor(){
			circle=88;
			System.out.println("monitor class constuctor");
		}
		void taste() {
			System.out.println("monitor class method");
		}
		void relay() {
			System.out.println(circle);
			System.out.println(circle);
		taste();
		
		}
	}


public class superkeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
monitor t1=new monitor();
t1.relay();

	}

}

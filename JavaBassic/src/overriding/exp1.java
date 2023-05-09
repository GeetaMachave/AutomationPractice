package overriding;
class ganesh{
void taste(double d) {
	System.out.println("taste method of ganesh");
}
}
class yugesh extends ganesh{
	 public void taste() {
		System.out.println("taste method class yugesh ");
	}
	 protected void taste(int i) {
			System.out.println("taste method class yugesh ");
		}
		 
	void result (double d) {
		System.out.println("seperating methods of parent class and child class");
		super.taste(2);
	}
}

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
yugesh j1=new yugesh();
j1.taste();
j1.result(56);
ganesh y1=new yugesh();
y1.taste(5);

	}

}

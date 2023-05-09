package overriding;
class human {
	protected void rock() {
		System.out.println("rock method of human class");
	}
}
class boy extends human{
	public void rock(){
	super.rock();	
		System.out.println("rock method of boy class");
	}
}

public class exp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boy e1=new boy();
e1.rock();
	}

}

package overriding;
class geeta{
final void show() {
System.out.println("show method of geeta");	
}
}
class donkey extends geeta{
	//we cannot override a final method **final means fixed
	//if we are trying to override a final method we will find an error 
	void show(){
	System.out.println("show method of donkey");	
	}
}
public class final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

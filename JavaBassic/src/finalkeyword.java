
public class finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=25;
System.out.println("here we are using local variable : "+a);
a=89;
System.out.println("we are reinitializing local variable :"+a);
a=56;
System.out.println("here we are reinitializing local variablr: "+a);
	}

}
class finalkeyword1{
	static public void display() {
		//if we declared variable final means it ids fixed we cant change it . it is fixed 
		// if we want to declare final keyword it is necessary to declare final ata the time of declaration you cannot change after once declaration 
	final int age=65;
	System.out.println("printing final keyword:"+age);
//if we are going to change the final variavble that is declared once we cant change it i.e.	age=56;
}
}
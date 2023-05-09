package abstractClass;
abstract class shape{
	abstract void salunke();
}
class rectangle extends shape{
	void salunke() {
		System.out.println("overriding salunke method");
	}
}
class circle extends shape{
	void salunke() {
		System.out.println("overriding salunke method");
	}
}
//hierarchical inheritance
public class abstractClass4 {
	
shape h21=new rectangle();

shape s=new circle();



}

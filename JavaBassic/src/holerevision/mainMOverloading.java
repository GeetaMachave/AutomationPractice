package holerevision;

public class mainMOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  System.out.println("overloading of main method");
  main(55);
 main(12.3f);
  
	}

	public static void main(float f)
	{
	System.out.println("using float variable");	
	}
	public static void main(int a)
	{
		System.out.println("using intiger parameter");	
	}

}
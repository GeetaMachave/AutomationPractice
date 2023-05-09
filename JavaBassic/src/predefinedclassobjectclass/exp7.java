package predefinedclassobjectclass;
class print {
	public int hashCode() {
		return 101;
	}
	public String toString() {
	return "overrided tostring method of object class";
}
	public boolean equals(Object obj) {
		return false;
	}
}
public class exp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp7 u1=new exp7();
		System.out.println(u1);
		System.out.println(u1.toString());
		System.out.println(u1.hashCode());
		exp7 j1=new exp7();
		System.out.println(j1);
		System.out.println(j1.toString());
		System.out.println(j1.hashCode());
		System.out.println(j1.equals(u1));
		
	}

}

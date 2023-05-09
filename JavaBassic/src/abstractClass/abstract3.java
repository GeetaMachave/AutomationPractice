package abstractClass;
abstract class rbibank{
	double rateofinterest() {
		System.out.println("double method of class rbibank");
	return 9.3;
	}	
}
class sbibank extends rbibank{
	double rateofinterest() {
		System.out.println("double method of class sbibank");
		return 5.3;
	}
}
public class abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sbibank k1=new sbibank();
rbibank m1=new sbibank();
m1.rateofinterest();

	}

}

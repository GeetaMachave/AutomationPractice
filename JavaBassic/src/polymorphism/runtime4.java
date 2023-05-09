package polymorphism;
class bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends bank{
	float getRateOfInterest() {
		return 8.4f;
	}	
}
class RBI extends bank{
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class runtime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b =new SBI();
		System.out.println("SBI RATEOFINTEREST "+b.getRateOfInterest());
		bank b1=new RBI();
		System.out.println(b1.getRateOfInterest());
		
		
	}

}

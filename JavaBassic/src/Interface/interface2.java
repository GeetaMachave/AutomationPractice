package Interface;
interface bank {
	float rateofinterest();
}
class sbi1 implements bank{
	public float rateofinterest() {
		return 9.15f;
	}
	class pnb1 implements bank {
		public float rateofinterest() {
			return 55.3f;
		}
	}
}
public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

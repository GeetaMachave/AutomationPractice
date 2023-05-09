package overriding;
class date{
	int rollno;
	double salary;
	//if we write explicite constructor we need to write explicite super statement 
	date(int rollno,double salary){
		 this.rollno=rollno;
		 this.salary=salary;
		
	}
}
class value extends date{
	float demand;
	value(int rollno,double salary,float demand){
		super(rollno,salary);
		this.demand=demand;
	}
}

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

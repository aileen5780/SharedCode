package core70;

class Vehicle{
	String type = "4W";
	int maxSpeed = 100;
	
//	Vehicle(){		
//	}
	
	Vehicle(String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
		
	}
	
}

class Car extends Vehicle {
	String trans;

//	Car(String trans){
//		this.trans = trans;
//	}
	Car(String type, int maxSpeed) {
		super(type, maxSpeed);
		// TODO Auto-generated constructor stub
	}
	
}

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

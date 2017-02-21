package ex201;

class Vehicle{
	String type = "4W";
	int maxSpeed = 100;
	
	Vehicle(){}
	
	Vehicle(String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class Test222 extends Vehicle{

//	Test222(String type, int maxSpeed) {
//		super(type, maxSpeed);
//		// TODO Auto-generated constructor stub
//	}

	String trans;
	Test222(String trans){
		this.trans = trans;
	}
	
	Test222(String type,int maxSpeed,String trans){
//		super(type, maxSpeed);
		this(trans);
	}

}

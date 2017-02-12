package ex041;

class Vehicle{
	int x;
	Vehicle(){
		this(10);
	}
	Vehicle(int x){
		this.x=x;
	}
}

class Car extends Test74{
	int y;
	Car(){
		super();
//		this(20);
	}
}


public class Test74 {
	int x;
	Test74(){
		this(10);
	}

	Test74(int x){
		this.x = x;
	}

}



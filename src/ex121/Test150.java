package ex121;

interface Test150 {
	String type = "A";
	void fly();
	
	default String getType(){
		return type;
	}
}

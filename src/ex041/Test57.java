package ex041;

public class Test57 {	 
	private String type;
	public String getType() {	 
		return type; 
	}
	 
	public void setType(String type) {	 
		this.type = type;	 
	}
 
public static void main(String[] args) {
 
	Test57 obj1 = new Test57();
	Test57 obj2 = new Test57();
 
	obj1.setType(null);	 
	obj2.setType("Fresco");	 
	System.out.print(obj1.getType() + " : " + obj2.getType());
 
}
 
}


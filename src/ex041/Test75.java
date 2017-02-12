package ex041;

public class Test75 {
	String name;
	boolean contract;
	double salary;
	Test75(){
//		this.name = "Joe";
//		this.contract = true;
//		this.salary = 100;
		
//		name = "Joe";
//		contract = TRUE;
//		salary = 100.0f;
		
		this.name = new String ("Joe");
		this.contract = new Boolean(true);
		this.salary = new Double(100);
		
//		this("Joe",true,100);
	}
	
	public String toString(){
		return name + ":" + contract + ":" + salary;
	}
	public static void main(String[] args) {
		Test75 t= new Test75();
//		t.name = "Joe";
//		t.contract = true;
//		t.salary = 100;
		
//		this.name = "Joe";
//		this.contract = true;
//		this.salary = 100;
		System.out.println(t);

	}

}

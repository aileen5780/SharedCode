package ex001;

public class Test004 {
	String name;
	int age = 25;
	public Test004(String name){
//		this();
		setName(name);
	}
	
	public Test004(String name, int age){
		//Test004(name);
		this(name);
		setAge(age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

package ex121;

class Caller{
	public void init(){
		System.out.println("Initialized");
	}
	
	public void start(){
		init();
		System.out.println("Started");
	}
}
public class Test122 {

	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();

	}

}

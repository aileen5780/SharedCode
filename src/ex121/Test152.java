package ex121;

public class Test152 {
	private int x = 0;
	private int y = 0;

	public static void main(String[] args) {
		Test152 t = new Test152();
		t.printThis(1,2);
		t.printThat(3,4);
	}	
	public void printThis (int x, int y) {
		x = x;
		y = y;
		System.out.println("X:" + this.x + "y:" + this.y);
	}
	public void printThat (int x, int y) {
		this.x =x;
		this.y =y;
		System.out.println("X:" + this.x + "y:" + this.y);
	}

	}


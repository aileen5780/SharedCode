package ex081;

public class Test115 {
	 
	int x; 
	int y;
 
	public void doStuff(int x, int y) {	 
		this.x = x;	 
		y =this.y;	 
	}
 
	public void display() {	 
		System.out.print(x + " " + y + " : ");	 
	}
 
	public static void main(String[] args) {
	 
		Test115 m1 = new Test115();		 
		m1.x = 100;	 
		m1.y = 200;
		 
		Test115 m2 = new Test115();		 
		m2.doStuff(m1.x, m1.y);		 
		m1.display();		 
		m2.display();	 
	}	 
}


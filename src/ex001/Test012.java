package ex001;
import java.util.ArrayList;
import java.util.List;

class Patient {
	String name;
	public Patient(String name){
		this.name = name;
	}
}

public class Test012 {

	public static void main(String[] args) {
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
//		int f = ps.indexOf(p2);		
		Patient p = new Patient("Mike");
		int f = ps.indexOf(p);
		if (f>=0) {
			System.out.println("Mike Found");
		}
	}		
}



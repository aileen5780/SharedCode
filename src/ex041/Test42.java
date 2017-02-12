package ex041;

import java.util.ArrayList;
import java.util.List;

public class Test42 {

	public static void main(String[] args) {
		List<Alpha1> strs = new ArrayList<Alpha1>();
		strs.add(new Alpha1());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha1 t: strs){
			System.out.println(t.doStuff("Java"));
		}	
	}
}
class Alpha1 {
	public String doStuff(String msg){
		return msg;
	}
}

class Beta extends Alpha1 {
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
}

class Gamma extends Beta {
	public String doStuff(String msg) {
		return msg.substring(2);
	}
}
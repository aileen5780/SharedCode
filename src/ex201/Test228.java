package ex201;
class Sports{
	int num_players;
	String name, ground_condition;
	private String sground;
//	Sports(){
//		System.out.println("no param");
//	}
	
	Sports(int np, String sname, String sgroup){
		num_players = np;
		name = sname;
		ground_condition = sground;
	}
}

class Cricket extends Sports{

	Cricket() {
//		System.out.println("no param");
		//super();
		super(11, "Cricket", "Condition OK");
		// TODO Auto-generated constructor stub
	}
	
}


public class Test228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
	}

}

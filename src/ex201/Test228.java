package ex201;
class Sports{
	int num_players;
	String name, ground_condition;
	private String sground;

	Sports(){}
	Sports(int np, String sname, String sgroup){
		num_players = np;
		name = sname;
		ground_condition = sground;
	}
}

class Cricket extends Sports{
	int num_umpires;
	int num_substitutes;

	//A
//	Cricket() {
//		super(11, "Cricket", "Condition OK");
//		num_umpires = 3;
//		num_substitutes = 2;		
//	}
	
	//B
//	Cricket() {
//		super.ground_condition = "Condition OK";
//		super.name = "Cricket";
//		super.num_players = 11;	
//		num_umpires = 3;
//		num_substitutes = 2;
//	}
	
	//C
//	Cricket() {
//		this(3,2);
//		super(11, "Cricket", "Condition OK");
//	}
//	Cricket(int nu, ns) {
//		this.num_umpires = nu;
//		this.num_substitutes = ns;
//	}
	
	//D
//	Cricket(){
//		this.num_umpires = 3;
//		this.num_substitutes = 2;
//		super(11, "Cricket", "Condition OK");
//	}
	
}


public class Test228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
	}

}

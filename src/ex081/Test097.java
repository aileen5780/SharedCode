package ex081;

class DBConfiguration{
	String user;
	String password;
}

public class Test097 {
	DBConfiguration DBConfiguration;
	DBConfiguration configureDB(String uname, String pword){
		
		return DBConfiguration;
		
	}
	public static void main(String[] args) {
		Test097 r = new Test097();
		DBConfiguration dbConf = r.configureDB("manager", "managerpw");
		int i = 5;
	}

}

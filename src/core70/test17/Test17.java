package core70.test17;

public class Test17 {

	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
//		acct.amount = 0;
//		int x = acct.getAmount();
//		acct.ChangeAmount(0);
		
//		acct.ChangeAmount(-acct.amount);
		acct.ChangeAmount(-acct.getAmount());
		
		
		System.out.println(acct.getAmount());

	}

}

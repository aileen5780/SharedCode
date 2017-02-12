package core70.test17;

public class CheckingAccount {
	public int amount;
	public CheckingAccount(int amount){
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}
	public void ChangeAmount(int x){
		amount += x;
	}

}

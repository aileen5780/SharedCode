package core70;

public class Test19 {
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading");
	}
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking");
	}

	public static void main(String[] args) {
		Test19 ex = new Test19();
		int cardNo = 12344;
		ex.checkCard(cardNo);
//		ex.readCard(cardNo);

	}

}

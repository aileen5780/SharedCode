package ex081;

public class Test087 {
	private boolean flag;
	
	public void displayServices(){
		int num = 2;
		while(flag){
			if (num%7 ==0)
				flag = false;
			System.out.println(num);
			num += 2;
		}
	}

	public static void main(String[] args) {
		new Test087().displayServices();

	}

}

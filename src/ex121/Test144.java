package ex121;

class Base2{
	protected int num;
	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num = num;
	}
	
}

public class Test144 extends Base2{

	public static void main(String[] args) {
		Test144 obj = new Test144();
		obj.setNum(3);
		System.out.println("Square = "+obj.getNum()*obj.getNum());

	}

}

package ex001;
class CD{
	int r;
	CD(int r){
		this.r = r;
	}
}

class DVD extends CD{
	int c;
	DVD(int r, int c){
		super(r);
		this.c = c;
		
	}
}

public class Test013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

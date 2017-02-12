package ex001;

class MissingInforException extends Exception{}

class AgeOutofRangeException extends Exception{}

class Candidate{
	String name;
	int age;
	Candidate(String name, int age) throws Exception{
		if(name == null){
			throw new MissingInforException();
		}else if (age<=10||age>=150){
			throw new AgeOutofRangeException();
		}else{
			this.name = name;
			this.age=age;
		}
	}
	public String toString(){
		return name+" age: " + age;
		
	}
}


public class Test016 {

	public static void main(String[] args) throws Exception {
		Candidate c = new Candidate("James",20);
		Candidate c1 = new Candidate("Williams",32);
		System.out.println(c);
		System.out.println(c1);

	}

}

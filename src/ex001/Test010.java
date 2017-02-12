package ex001;

public class Test010 {
	double radius;
	public double area;
	public Test010(double r){radius = r;}
	public double getRadius(){return radius;}
	public void setRadius(double r){radius = r;}
	public double getArea(){
		return Math.PI*radius*radius;
	}
}	

class App{
	public static void main(String[] args) {
		Test010 c1 = new Test010(17.4);
		c1.area = Math.PI*c1.getRadius()*c1.getRadius();

	}

}

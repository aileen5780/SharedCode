package ex041;

public class Test54 {
	public String name;
	public int moons;
	
	public Test54(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}

	public static void main(String[] args) {
		Test54[] planets = {
				new Test54("Mercury", 0),
				new Test54("Venus", 0),
				new Test54("Earth", 1),
				new Test54("Mars", 2),
		};
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);

	}

}

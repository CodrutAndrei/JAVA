
public class TestDog {
	public static void main(String[] args) {
		Animal a=new Animal(); //animal reference and object
		Animal b=new Dog(); //animal reference but Dog object
		
		a.move(); // runs the method in Animal Class
		b.move(); //runs the method in Dog Class
		//b.bark();
	}
}

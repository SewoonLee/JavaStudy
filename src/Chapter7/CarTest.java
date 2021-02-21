package Chapter7;

public class CarTest {
	public static void main(String args[]) {
		Car c = new Car();
		c.setSpeed(10);
		System.out.println(c.speed);
		
		SportCar sc = new SportCar();
		System.out.println(sc.speed);
		
	}
}

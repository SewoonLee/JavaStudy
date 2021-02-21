package Chapter7;

public class SportCarTest {
	public static void main(String args[]) {
		SportCar obj = new SportCar();
		
		// 부모 클래스의 필드와 메소드 사용
		obj.speed = 10;
		obj.setSpeed(60);
		
		// 자체 메소드 사용
		obj.setTurbo(true);
	}
}

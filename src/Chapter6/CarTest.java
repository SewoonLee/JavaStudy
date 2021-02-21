package Chapter6;

public class CarTest {
	public static void main(String args[]) {
		Car c1 = new Car("S600", "white", 80);	// 생성자 호출
		Car c2 = new Car("E500", "blue", 20);	// 생성자 호출
		
		int n = Car.numbers; // 정적 변수	
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
		int n1 = Car.getNumberOfCars();	// 정적 메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n1);
	}
}

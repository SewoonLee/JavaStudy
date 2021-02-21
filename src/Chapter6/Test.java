package Chapter6;

public class Test {
	public static void main(String args[]) {
		int sum;
		
		sum = add(10, 20); 
		System.out.println(sum);
	}
	
	// 정적 메소드 안에서 인스턴스 메소드는 호출할 수 없음
//	int add(int x, int y) {
//		return x + y;
//	}
	
	// 클래스 메소드에서 클래스 메소드는 호출 가능
	static int add(int x, int y) {
		return x + y;
	}
	
}

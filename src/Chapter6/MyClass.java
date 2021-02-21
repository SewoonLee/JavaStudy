package Chapter6;

public class MyClass {
	static int x;
	int y;
	
	static {
		x = 10;
		System.out.println("정적 블록이 호출되었음");
	}
}

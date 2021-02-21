package Chapter6;

public class OuterClassTest {
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass(); // 외부 클래스 바깥에서 내부 클래스의 객체 생성
		
		inner.myMethod();
	}
}

package Chapter7;

//class Base {
//	public Base() {
//		System.out.println("Base() 생성자");
//	}
//}
//
//class Dervice extends Base {
//	public Dervice() {
//		System.out.println("Dervice() 생성자");
//	}
//}
//
//public class Test {
//	public static void main(String args[]) {
//		Dervice d = new Dervice();
//	}
//}

class Shape1 {
	public Shape1() {
		System.out.println("Shape 생성자()");
	}
}

class Rectangle1 extends Shape1 {
	public Rectangle1() {
//		super();	// 명시적 호출
		System.out.println("Rectangle 생성자()");
	}
}

class ColorRectangle extends Rectangle1 {
	public ColorRectangle() {
		System.out.println("ColorRectangle 생성자()");
	}
}

public class Test {
	public static void main(String args[]) {
		ColorRectangle c = new ColorRectangle();
	}
}
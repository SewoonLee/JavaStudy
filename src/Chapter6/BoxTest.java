package Chapter6;

public class BoxTest {
	public static void main(String args[]) {
		Box box1 = new Box(10, 20, 50);
		Box box2 = new Box(10, 50, 20);
		
		System.out.println(box1.isSameBox(box1, box2));
	}
}

package Chapter9;


public class MyThread {
	public static void main(String args[]) {
		Thread t = new Thread(new Runnable() { 		// t = Thread의 객체 X, Thread를 확장한 익명 클래스의 객체 O
			public void run() {
				System.out.println("Child Thread");
			}
		});
		t.start();
		System.out.println("Main Thread");
	}
	// @FunctionalInterface 람다식
}

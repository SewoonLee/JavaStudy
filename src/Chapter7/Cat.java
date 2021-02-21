package Chapter7;

public class Cat extends Zoo {
	public static void eat() {
		System.out.println("Cat의 정적 메소드 eat()");
	}
	
	public void sound() {
		System.out.println("Cat의 인스턴스 메소드 sound()");
	}
	
	public static void main(String args[]) {
		Cat myCat = new Cat();
		
		Zoo myAnimal = new Zoo();
		
		myAnimal.sound();
		
		
		
	}
}

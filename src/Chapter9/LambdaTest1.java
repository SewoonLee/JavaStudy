package Chapter9;

@FunctionalInterface
interface Hello {
	void sayHello();
}

public class LambdaTest1 {
	public static void main(String args[]) {
		Hello hello = () -> System.out.println("Hello Lambda");
		hello.sayHello();
	}
}

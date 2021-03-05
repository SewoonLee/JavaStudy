package Chapter9;

interface Age {
	int age = 29;
	void getAge();
}
//
//class AgeTest implements Age {
//	@Override
//	public void getAge() {
//		System.out.println("Age is " + age);
//	}
//}
//
//class AnonymousDemo {
//	public static void main(String args[]) {
//		AgeTest obj = new AgeTest();
//		obj.getAge();
//	}
//}

class AnonymousDemo {
	public static void main(String args[]) {
		Age obj1 = new Age() {
			@Override
			public void getAge() {
				System.out.println("Age is " + age);
			}
		};
		obj1.getAge();
	}
}
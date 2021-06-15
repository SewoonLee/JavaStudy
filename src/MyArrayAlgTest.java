package Chapter15;

public class MyArrayAlgTest {
	public static void main(String args[]) {
		String[] language = {"C++", "C#", "JAVA"};
		
		String last = getLast(language);
//		원한다면 실제 자료형을 꺽쇠 안에 넣어주어도 된다.
//		String last = <String>.getLast(language);
		
		System.out.println(last + "\n\n");
		
		
		// swap 제네릭 메소드
		for(String value : language)
			System.out.println(value);
		
		System.out.println();
		
		MyArrayAlg.swap(language, 1, 2);
		for(String value : language)
			System.out.println(value);
		
		System.out.println();
		
		
		// getMax 제네릭 메소드 -->  한정된 타입 매개 변수(bounded type parameter)
		String[] list = {"xyz", "abc", "def" };
		String max = MyArrayAlg.getMax(list);
		System.out.println(max);
		
	}
	
	// 제네릭 반환형 메소드(매개변수 )
	static <T> T getLast(T[] a) {
		return a[a.length -1];
	}
	
}

class MyArrayAlg{
	
	// 반환값 void?
	static <T> T[] swap(T[] a, int i, int j) {
		T temp;
		
		temp = a[1];
		a[1] = a[2];
		a[2] = temp;
		
		return a;
	}
	
	
	// 한정된 타입 매개 변수 (bounded  type parameter)
	static <T extends Comparable> T getMax(T[] a)
	{
		if (a == null || a.length == 0)
			return null;
		T largest = a[0];
		for (int i = 1; i < a.length; i++)
			if (largest.compareTo(a[i]) < 0)
				largest = a[i];
		return largest;
	}
}

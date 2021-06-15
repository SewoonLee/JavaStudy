package Chapter15;

public class GenericMethodTest {
	public static void main(String args[]) {
		Integer[] iArray = { 10, 20, 30, 40, 50 };
		Double[] aArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
		
		printArray(iArray);
		printArray(aArray);
		printArray(cArray);
	}
	
	public static <T> void printArray(T[] a) {
		for(T value : a)
			System.out.print(value + " ");
		
		System.out.println();
	}
	
}

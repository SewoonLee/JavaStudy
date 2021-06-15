package Chapter15;

public class SimpleArrayListTest {
	public static void main(String args[]) {

//		SimpleArrayList list = new SimpleArrayList();
//		
//		list.add(50);
//		list.add(100);
//
//		Integer value1 = (Integer) list.get(0);
//		Integer value2 = (Integer) list.get(1);
//		
//		System.out.println(value1 + value2);
//		
//		
		
		GenericArrayList<Integer> gList = new GenericArrayList();
		
		gList.add(1);
		gList.add(2);
		
		int result1 = gList.get(0);
		int result2 = gList.get(1);
		
		System.out.println(result1 + result2);
	}
	
}

class Test {
	Test() {
	}
	
	public static void main(String[] var0) {
		GenericArrayList var1 = new GenericArrayList();
		var1.add(1);
		var1.add(2);
		int var2 = (Integer)var1.get(0);
		int var3 = (Integer)var1.get(1);
	}
}

class SimpleArrayList {
	private int size;
	private Object[] elemnetData = new Object[5];
	
	public void add(Object value) {
		elemnetData[size++] = value;
	}
	
	public Object get(int idx) {
		return elemnetData[idx];
	}
}

class GenericArrayList<T> {
	private Object[] elementData = new Object[5];
	private int size;
	
	public void add(T value) {
		elementData[size++] = value;
	}
	
	public T get(int idx) {
		return (T) elementData[idx];
	}
}
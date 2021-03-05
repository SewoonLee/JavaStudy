package Chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest3 {
	public static void main(String args[]) {
		List<String> list = new ArrayList();
		list.add("AAA");
		list.add("bbb");
		list.add("CCC");
		list.add("ddd");
		list.add("EEE");
		
		Collections.sort(list); // 대소문자를 구별하는 정렬
		
		System.out.println("대소문자를 구별한 정렬:");
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) -> o1.compareToIgnoreCase(o2));	// 람다식을 이용하여서 댜소문자를 무시하는 비교 메소드를 작성하여 전달한다.
		
		System.out.println("대소문자를 구별하지 않은 정렬:");
		System.out.println(list);
		
	}
}

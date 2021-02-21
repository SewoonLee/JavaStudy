package Chapter6;

public class Employee {
	private String name;
	private double salary;
	static int count;
	
	// 생성자
	Employee(String n, double s) {
		name = n;
		salary = s;
		
		count++; // 정적 변수인 count를 증가
	}
	// protected를 붙여야하 이유?
	// -> 소멸자 object 클래스의 메소드
	protected void finalize() { 
		count--;
	}
	
	// 정적 메소드
	static int getCount(){
		return count;
	}
	
	
}

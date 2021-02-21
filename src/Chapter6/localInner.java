package Chapter6;

class localInner {
	private int data = 30; // 인스턴스 변수
	
	void display() {
		final String msg = "현재의 데이터값은 ";
		
		class Local {
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}


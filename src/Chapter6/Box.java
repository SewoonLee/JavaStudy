package Chapter6;

public class Box {
	private int width;
	private int length;
	private int height;
//	private int volume;
	
	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
//		volume = w * l * h;
	}
	
//	boolean isSameBox(Box obj1, Box obj2) {
//		return obj1.volume == obj2.volume ? true : false; 	// 박스의 크기 바교
//	}
	
	boolean isSameBox(Box obj1, Box obj2) {
		if ((obj1.width == obj2.width) && (obj1.length == obj2.length) && (obj1.height == obj2.height)) {	// 전체 비교
			return true;
		}else {
			return false;
		}
	}
	
}


package Chapter6;
import java.util.*;

public class GameCharacter {
	
	private class GameItem {
		String name;
		int type;
		int price;
		
		int getPrice() {
			return price;
		}
		
		// public 으로 작성해야 하는 이유?
		public String toString() {
			return "name: " + name + " type: " + type + " price: " + price;  
		}
	}
	
	// ArrayList<>?
	private ArrayList<GameItem> list = new ArrayList<>();
	
	public void add(String name, int type, int price) {
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		
		list.add(item); // ??
	}
	
	 public void print() {
		 int total = 0;
		 for (GameItem item : list) {
			 System.out.println(item);
			 
			 // 합	
			 total += item.getPrice();
			 System.out.println(total);
		 }
	}
}

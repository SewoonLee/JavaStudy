package Chapter7;

public class Date {
	private int year;
	private int month;
	private int date;
	
	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public String toString() {
		return "year: " + year + " month: " + month + " date: " + date;
	}
}


public class Date {
	
	private int month;
	private int day;
	private int year;
	
	//default constructor
	public Date() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}

	//value constructor
	public Date(int year, int month, int day) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public static Date add(Date d1, Date d2) {
		Date sum = new Date();
		sum.month = d1.month + d2.month;
		sum.day = d1.day + d2.day;
		sum.year = d1.year + d2.year;
		
		if(sum.day > 31) {
			sum.month++;
			sum.day %= 31;
		}
		
		if(sum.month > 12) {
			sum.year++;
			sum.month %= 12;
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	
	
}

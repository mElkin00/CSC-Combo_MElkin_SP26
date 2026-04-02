
public class DateDriver {

	public static void main(String[] args) {
		Date date = new Date(2000, 80, 20);
		Date date2 = new Date(01, 9, 2001);
		
		//Date date3 = Date.add(date, date2);
		System.out.println(date.getMonth() + "/" + date.getDay() + "/" + date.getYear());

	}

}


public class DateDriver {

	public static void main(String[] args) {
		Date date = new Date(01, 01, 2000);
		Date date2 = new Date(01, 10, 2001);
		
		Date date3 = Date.add(date, date2);
		System.out.println(date3);

	}

}

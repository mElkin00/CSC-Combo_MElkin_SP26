
public class String2_mixString {

	public static void main(String[] args) {
		String a = "hi", b = "There";
		String c = "";
		int i = a.length() + b.length();

		//string c should be a(0)b(0)a(1)b(1) etc....
		while(i > 0) {
			
			if(a.length() > 0) {
				c = c + a.substring(0, 1);
				a = a.replaceFirst(a.substring(0, 1), "");
			}
			
			if(b.length() > 0) {
				c = c + b.substring(0, 1);
				b = b.replaceFirst(b.substring(0, 1), "");
			}
			
			i = i - 1;
		}
		System.out.println(c);

	}

}

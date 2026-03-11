
public class Strings2 {

	public static void main(String[] args) {
		//Make every letter in a string repeat ex. The -> TThhee
		//double char
		String str = "AAbb";
		String n = str.substring(0, 1);
		for(int i = 0; i < str.length(); i++) {
			n = str.substring(i, i + 1);
			System.out.print(n + n);
			i = i++;
			
		
			
		}
		
		//doubleChar
//		public String doubleChar(String str) {
//			  String result = "";
//			  String n = result;
//			  for(int i = 0; i < str.length(); i++) {
//			    result = str.substring(i, i + 1);
//			    result = result + result;
//			    i = i++;
//			    n = n + result;
//			  }
//			  return n;
//			}
	}
}


public class Strings2_xyzThere {

	public static void main(String[] args) {
		
		String str = ".xyz";
		if(xyzThere(str) == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

	private static boolean xyzThere(String str) {
		str = str.replace(".xyz", "");
		if(str.contains("xyz")) return true;
		return false;
		// TODO Auto-generated method stub
		
	}


}

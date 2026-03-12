
public class String2_xyBalance {

	public static void main(String[] args) {
		
		String str = "bbybxbbbbbbb";
		System.out.println(str);
		xyBalance(str);
		
		  if(xyBalance(str) == true) { System.out.println("True");
		  
		  } else { System.out.println("False"); }
		 

	}

	private static boolean xyBalance(String str) {
		//find the last occurance of y and check if an x appears after it.
		//if an x appears after the last y, it is false
		//if an x appears and no y appears, it is false
		//if any number of x's appear before the last y, it is true
		if(!str.contains("x")) return true;
		if(str.substring(str.lastIndexOf('x'), str.length()).contains("y")) return true;
		return false;
		
	}

}

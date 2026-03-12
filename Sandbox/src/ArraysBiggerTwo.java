
public class ArraysBiggerTwo {

	public static void main(String[] args) {
		int[] a = {5, 2};
		int[] b = {3, 4};
		int i = 0;
		int sumA = 0;
		int sumB = 0;
		
		for(i = 0; i < a.length; i++) {
			sumA += a[i];
		}
		System.out.println("SumA: " + sumA);
		
		for(i = 0; i < b.length; i++ ) {
			sumB += b[i];
		}
		System.out.println("SumB: " + sumB);
		
		if(sumA > sumB) System.out.println(sumA);
		else if(sumA < sumB) System.out.println(sumB);
		else System.out.println("SameValue " + sumA);
		
	}

}

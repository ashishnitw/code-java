// package misc;

public class Walmart {
	public static int compatibilityDiff2Arrays(int[] a, int[] b) {
		int n = a.length;
		int res = 0;
		for(int i=0;i<n;i++) {
			if(a[i]!=b[i]) {
				int j = i+1;
				while(a[i]!=b[j])
					j++;
				while(j!=i) {
					//swap
					int temp = b[j-1];
					b[j-1] = b[j];
					b[j] = temp;
					j--;
					res++;
				}
			}
		}
		return res;
	}
	public static int median(int[] a) {
		int m = 0;
		
		return m;
	}
	public static void getUglyNumber(int n) {
		
	}
	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 4, 5 };
		int[] b = { 3, 2, 4, 1, 5 };
		System.out.println(compatibilityDiff2Arrays(a, b));
		
		
		
		
		
		
	}
}

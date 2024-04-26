// package misc;

import java.util.HashMap;

public class MMT {
	public static String SmallestWindowContainingString(String s, String p) {
		int l1 = s.length();
		int l2 = p.length();
		if(l1<l2)
			return "";
		int[] hash_s = new int[256];
		int[] hash_p = new int[256];
		for(int i=0;i<l2;i++) {
			hash_p[p.charAt(i)]++;
		}
		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
		int count = 0;
		for(int i=0;i<l1;i++) {
			hash_s[s.charAt(i)]++;
			if(hash_p[s.charAt(i)]!=0 && hash_s[s.charAt(i)] <= hash_p[s.charAt(i)])
				count++;
			if(count==l2) {
				while(hash_s[s.charAt(start)] > hash_p[s.charAt(start)] || hash_p[s.charAt(start)] == 0) {
					if (hash_s[s.charAt(start)] > hash_p[s.charAt(start)])
                        hash_s[s.charAt(start)]--;
                    start++;
				}
				int len_window = i - start + 1;
				if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
			}
		}
		if (start_index == -1)
        {
           System.out.println("No such window exists");
           return "";
        }
		return s.substring(start_index, start_index + min_len);
	}
	public static void findDuplicate(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.println(Math.abs(arr[i]));
		}
	}
	public static char encodedChar(String e, int k) {
		
		return 0;
	}
	public static int knapSack(int W, int[] wt, int[] val, int n) {
		if(n==0||W==0)
			return 0;
		if (wt[n-1] > W)
			return knapSack(W, wt, val, n-1);
		else return Integer.max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1),knapSack(W, wt, val, n-1));
	}
	static int knapSack2(int W, int wt[], int val[], int n)
    {
		int i, w;
		int K[][] = new int[n+1][W+1];
      
		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++)
		{
			for (w = 0; w <= W; w++)
			{
				if (i==0 || w==0)
					K[i][w] = 0;
				else if (wt[i-1] <= w)
					K[i][w] = Integer.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
				else
                   K[i][w] = K[i-1][w];
         }
      }
      return K[n][W];
    }
	public static int maxSumSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int max_curr = 0;
		for(int i=0;i<arr.length;i++) {
			max_curr = max_curr + arr[i];
			if(max < max_curr)
				max = max_curr;
			if(max_curr < 0)
				max_curr = 0;
		}
		return max;
	}
	public static double power(double x, int y) {
		double temp;
		if(y==0)
			return 1;
		
		temp = power(x, y/2); 
		if(y%2==0)
			return temp*temp;
		else {
			if(y>0)
				return x*temp*temp;
			else
				return temp*temp/x;
		}
	}
	public static int largestSubArraySumZero(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;
		int max_len = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if (arr[i] == 0 && max_len == 0)
                max_len = 1;
			if (sum == 0)
                max_len = i+1;
			Integer prev_i = hm.get(sum);
			if (prev_i != null)
	               max_len = Math.max(max_len, i-prev_i);
	            else  // Else put this sum in hash table
	               hm.put(sum, i);
		}
		
		return max_len;
	}
	public static void main(String[] args) {
		String s = "this is a test string";
		String p = "tist";
		System.out.println(SmallestWindowContainingString(s,p));
		int[] a1 = {1, 2, 3, 1, 3, 6, 6};
		findDuplicate(a1);
		
		int val[] = new int[]{60, 100, 120};
		int wt[] = new int[]{10, 20, 30};
		int  W = 50;
	    int n = val.length;
	    System.out.println(knapSack(W, wt, val, n));
	    System.out.println(knapSack2(W, wt, val, n));
		
	    String str = "ab4c12ed3"; int k = 21;
	    System.out.println(encodedChar(str, k));
	    
	    int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	    System.out.println(maxSumSubArray(a));
	    System.out.println(power(1.5,2));
	    System.out.println(largestSubArraySumZero(a));
	    
	}
}

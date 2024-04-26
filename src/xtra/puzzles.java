// package misc;

public class puzzles {
	public static int countNumFinger(int n) {
		int r = n%8;
		if(r==1)
			return 1;
		else if(r==0 || r==2)
			return 2;
		else if(r==3 || r==7)
			return 3;
		else if(r==4 || r==6)
			return 4;
		else
			return 5;
	}
	public static void towerOfHanoi(int n, String from, String to, String aux) {
		if(n==1) {
			System.out.println(1 + " : moved from " + from + " -> " + to);
			return;
		}
		towerOfHanoi(n-1, from, aux, to);
		System.out.println(n + " : moved from " + from + " -> " + to);
		towerOfHanoi(n-1, aux, to, from);
	}
	
	
	
	public static void main(String[] args) {
		countNumFinger(30);
		towerOfHanoi(3, "A", "B", "C");
		
		
		
		
	}
}

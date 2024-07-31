package _01_basics;

public class _05_Logical {
	public static void main(String[] args) {
		int x = 100;
		int y = 0;
		try {
			if (y > 0 & x/y > 30)
				System.out.println(x/y);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Failed");
		}
		try {
			if (y > 0 && x/y > 30)
				System.out.println(x/y);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Failed");
		}
		System.out.println("End Program");
	}

}

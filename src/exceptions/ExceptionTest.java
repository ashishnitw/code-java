package exceptions;

public class ExceptionTest {
	
	public static int fun() {
		int a = 1;
		int b = 0;
		try {
			return a/b;
		}
		catch(Exception e){
			System.out.println("exception catched");
			return 0;
		}
		finally {
			System.out.println("program terminates finally");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fun());
	}

}

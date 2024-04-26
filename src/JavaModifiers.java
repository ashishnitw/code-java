// package coreJava;
class AccessDemo{
	
}
class StaticDemo{
	static int a;		//static variable
	
	
	public static void show() {		//static method
		System.out.println("Show: "+a);
	}
	
	static {		//static block, used to initialized static variables
		//It is executed before main method at the time of classloading
		a = 4;
	}
	{				//normal block
		
	}
}

public class JavaModifiers {

	public static void main(String[] args) {
		AccessDemo cd = new AccessDemo();
		
		StaticDemo md = new StaticDemo();
		md.a = 2;	md.show();	
		StaticDemo.a = 6;	StaticDemo.show();
		
		
		
		
	}

}

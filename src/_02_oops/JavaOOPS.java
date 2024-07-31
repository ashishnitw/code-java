package _02_oops;

// package coreJava;
class OopsDemo implements Cloneable{
	int a;
	private int b;
	public OopsDemo() {			//default constructor
		
	}
	public OopsDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void show() {
		System.out.println("SHOW:");
	}
	public Object clone() throws CloneNotSupportedException{  
		return super.clone();  
	}
	public static void swap(OopsDemo o1, OopsDemo o2) {
		int temp = o1.a;
		o1.a = o2.a;
		o2.a = temp;
	}
	public static void swapObj(OopsDemo o1, OopsDemo o2) {
		OopsDemo temp = o1;
		o1 = o2;
		o2 = temp;
	}
	public static void swap(OopsDemoWrapper cw1, OopsDemoWrapper cw2){
		OopsDemo temp = cw1.c;
		cw1.c = cw2.c;
		cw2.c = temp;
	}
}
//A Wrapper over class that is used for swapping
class OopsDemoWrapper{
	OopsDemo c;
	OopsDemoWrapper(OopsDemo c) {
		this.c = c;
	}
}

public class JavaOOPS {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		new OopsDemo(2,4);		//anonymous object
		
		// 4 ways to create an object
		OopsDemo o1 = new OopsDemo();
		OopsDemo o2 = (OopsDemo) Class.forName("CoreJava.oops.OopsDemo").newInstance();
		OopsDemo o3 = (OopsDemo) o1.clone();
		//De-serialization is technique of reading an object from the saved state in a file.
		//FileInputStream file = new FileInputStream(filename);
		//ObjectInputStream in = new ObjectInputStream(file);
		//Object obj = in.readObject();
		
		OopsDemo o4 = new OopsDemo(2,2);
		OopsDemo o5 = new OopsDemo(4,4);
		System.out.println("o4.a = " + o4.a + ", o5.a = " + o5.a);
		OopsDemo.swap(o4,o5);		//swaps fields
		System.out.println("o4.a = " + o4.a + ", o5.a = " + o5.a);
		OopsDemo.swapObj(o4, o5);	//does not swaps objects
		System.out.println("o4.a = " + o4.a + ", o5.a = " + o5.a);
		
		//parameters are passed by value in Java. So when we pass o4 and o5 to swap(), the function swapObj() creates a copy of these references.
		//Solution is to use Wrapper Class If we create a wrapper class that contains references of Car, we can swap cars by swapping references of wrapper class.
		OopsDemoWrapper o6 = new OopsDemoWrapper(o4);
		OopsDemoWrapper o7 = new OopsDemoWrapper(o5);
		OopsDemo.swap(o7, o6);
		System.out.println("o4.a = " + o6.c.a + ", o5.a = " + o7.c.a);
		
		
		System.out.println("as");
				
		
	}

}

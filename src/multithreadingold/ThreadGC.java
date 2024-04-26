package multithreadingold;
// package MultiThreading;

class TestIsland{
	TestIsland i;
	@Override
	protected void finalize() {
        System.out.println("Finalize method called");
	}
}
class TestGC{
	String ObjName;
	public TestGC() {
	}
	public TestGC(String objName) {
		ObjName = objName;
	}
	@Override
	protected void finalize() throws Throwable {
		//super.finalize();
        System.out.println("Object garbage collected : " + this.ObjName);
	}
	public static void createObject() {
		TestGC t = new TestGC("a1");
	}
	public static void createObject2() {
		TestGC t = new TestGC("a2");
		createObject();
	}
}
public class ThreadGC {

	public static void main(String[] args) {
		//Nullifying the reference variable
		TestGC t1 = new TestGC();
		TestGC t2 = new TestGC();
		t1 = null;
		System.gc();
		t2 = null;
		Runtime.getRuntime().gc();
		
		//object created inside method
		TestGC.createObject2();
		System.gc();
		
		//Reassigning the reference variable
		TestGC t3 = new TestGC("t3");
		TestGC t4 = new TestGC("t4");
		t3 = t4;
		System.gc();
		
		//anonymous object
		new TestGC("t5");
		System.gc();
		
		//Island of Isolation
		TestIsland a1 = new TestIsland();
		TestIsland a2 = new TestIsland();
		a1.i = a2;
		a2.i = a1;
		a1 = null; a2 = null;
		System.gc();
		
		
	}
}


interface IMethodReference{
	void show();
}
interface IMethodReference2{
	void show(String msg);
}
class MethodReferenceStatic{
	public static void showSomething() {
		System.out.println("inside static method");
	}
}
class MethodReferenceInstance{
	public void showSomething() {
		System.out.println("inside instance method");
	}
}
class MethodReferenceConstructor{
	MethodReferenceConstructor(String msg) {
		System.out.println(msg);
	}
}

public class Java8MethodReference {	
	public static void main(String[] args) {
		IMethodReference mr1 = MethodReferenceStatic::showSomething;
		mr1.show();
		Thread t1 = new Thread(MethodReferenceStatic::showSomething);
		t1.start();
		
		IMethodReference mr2 = new MethodReferenceInstance()::showSomething;
		mr2.show();
		Thread t2 = new Thread(new MethodReferenceInstance()::showSomething);
		t2.start();
		
		String msg = "Hello";
		IMethodReference2 mr3 = MethodReferenceConstructor::new;
		mr3.show(msg);
	}
}

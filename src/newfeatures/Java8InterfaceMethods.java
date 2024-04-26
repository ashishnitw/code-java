
interface IInterfaceMethod{
	default void show() {
		System.out.println("inside default method");
	}
	static void call() {
		System.out.println("inside static method");
	}
}
class InterfaceMethodDemo implements IInterfaceMethod{
	
}
public class Java8InterfaceMethods {
	public static void main(String[] args) {
		InterfaceMethodDemo m1 = new InterfaceMethodDemo();
		m1.show();
		IInterfaceMethod.call();
		
		
		
	}
}

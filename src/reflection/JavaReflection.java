package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionDemo{
	public void show() {
		System.out.println("Show : " );
	}
	private void showP() {
		System.out.println("Show : Private" );
	}
}
//Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime
public class JavaReflection {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//to create an object
		//new operator is used to create objects, but if we want to decide type of object to be created at runtime, there is no way we can use new operator. In this case, we have to use newInstance() method
		Class c = Class.forName("newFeatures.ReflectionDemo");
		ReflectionDemo a = (ReflectionDemo) c.newInstance();
		a.show();
		
		//calling private method
		Method m = c.getDeclaredMethod("showP", null);
		m.setAccessible(true);
		m.invoke(a, null);
		
		//Class class methods
		System.out.println(c.isInterface());
		System.out.println(c.getSuperclass());
		
		//javap command - used to get the structure of class
		
		//when we want to check the class of object dynamically. In this case isInstance() method will work. There is no way we can do this by instanceof operator.
		System.out.println(a instanceof ReflectionDemo);
		System.out.println(Class.forName("newFeatures.ReflectionDemo").isInstance(a));
		
	}
}

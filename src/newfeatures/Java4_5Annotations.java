
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

@FunctionalInterface
interface FuncInterAnno {
	void show();
}
class ParentAnnot{
	public void show() {System.out.println("Parent: show");}
}
class ChildAnnot extends ParentAnnot{
	@SuppressWarnings("unckeck")
	@Override
	public void show() {
		System.out.println("Child: show");
		ArrayList al = new ArrayList();
	}
	@Deprecated
	public void print() {
		System.out.println("Child: print");
	}
}
//create custom annotation
//marker annotation	//single value annotation	//multi-value annotation
@Retention(RetentionPolicy.RUNTIME)	//meta-annotations
@interface SmartPhone{
	String os();
	int version() default 1;
}

@SmartPhone(os = "Android", version = 6)
class NokiaASeries{
	String model;
	int size;
	public NokiaASeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
	
}
public class Java4_5Annotations {
	public static void main(String[] args) {
		ChildAnnot ca = new ChildAnnot();
		ca.show();
		ca.print();
		
		NokiaASeries n = new NokiaASeries("Fire", 5);
		System.out.println(n.model + ", " + n.size);
		
		Class c = n.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone sp = (SmartPhone) an;
		System.out.println(sp.os());
	}
}

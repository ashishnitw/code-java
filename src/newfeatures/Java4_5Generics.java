
import java.util.Arrays;
import java.util.List;

class GenericDemo<T>{
	T obj;
	public GenericDemo(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return this.obj;
	}
}
class GenericDemo2<T,U>{
	T a;
	U b;
	public GenericDemo2(T o1, U o2) {
		this.a = o1;
		this.b = o2;
	}
	@Override
	public String toString() {
		return "GenericDemo2 [a=" + a + ", b=" + b + "]";
	}
}
public class Java4_5Generics {
	public static <T> void display(T a){
		System.out.println(a.getClass().getName() + " = " + a);
	}
	public static void printList(List<?> list) {	//wildcard
		System.out.println(list);
	}
	public static void main(String[] args) {
		
		GenericDemo<Integer> a = new GenericDemo<Integer>(16);
		System.out.println(a.getObj());
		
		GenericDemo<String> b = new GenericDemo<String>("Ashish");
		System.out.println(b.getObj());
		
		GenericDemo2<String, Integer> c = new GenericDemo2<String,Integer>("Ashish",12);
		System.out.println(c.toString());
		
		display("Ashish");
		display(57);
		display(5.86);
		
		//wildcards "?"
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Double> list2 = Arrays.asList(1.1,2.2,3.3);
		printList(list1);
		printList(list2);
		
		
		
		
		
	}
}

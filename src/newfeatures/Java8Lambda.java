import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

@FunctionalInterface
interface LambdaDemo{
	void show(int i);
}
///////
class ConsumerImplDemo implements Consumer<Integer>{
	@Override
	public void accept(Integer i) {
		System.out.println(i);
	}
}
////////
interface Parser{
	public String parse(String s);
}
class StringParser{
	public static String convert(String s) {
		if(s.length()<=3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}
}
class MyPrinter{
	public void print(String s, Parser p) {
		s = p.parse(s);
		System.out.println(s);
	}
}
//
class LambdaStudent{
	int roll;
	String name;
	int marks;
	public LambdaStudent(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
}
public class Java8Lambda {
	public static void main(String[] args) {
		LambdaDemo a = i -> System.out.println("show : " + i);
		a.show(6);
		
		List<Integer> l = Arrays.asList(2,3,4,5,6,7);
		l.forEach( i -> System.out.println("element : " + i));
		
		Consumer<Integer> con = new ConsumerImplDemo();
		l.forEach(con);
		
		//creating threads
		Runnable r1 = () -> {
			System.out.println("Thread r1 running...");
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//comparator
		List<LambdaStudent> ls = new ArrayList<>();
		ls.add(new LambdaStudent(14, "Ritesh", 30));
		ls.add(new LambdaStudent(16, "Ashish", 90));
		ls.add(new LambdaStudent(11, "Mayank", 70));
		ls.add(new LambdaStudent(19, "Hitesh", 40));
		Collections.sort(ls, (s1,s2) -> {
			return s1.name.compareTo(s2.name);
		});
		for(LambdaStudent s: ls)
			System.out.println(s.roll + ", " + s.name + ", " + s.marks);
		
		//Filter Collection Data
		Stream<LambdaStudent> lsFiltered = ls.stream().filter(s -> s.marks>50);
		lsFiltered.forEach(s -> System.out.println(s.name+": "+s.marks));
		
		
		//method reference
		List<String> list = Arrays.asList("Ashish","Ranjan","Rishi","Gautam");
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("name: "+s);
			}
		};
		//list.forEach(s-> System.out.println(s));
		list.forEach(c);
		list.forEach(System.out::println);	//functional programming, method reference
		
		MyPrinter mp = new  MyPrinter();
		String s = "Ashish Ranjan";
		mp.print(s, new Parser() {				//anonymous class
			@Override
			public String parse(String s) {
				return StringParser.convert(s);
			}
		});
		mp.print(s, (str) -> StringParser.convert(str));	//lambda exp
		mp.print(s, StringParser::convert);			//method reference
		//mp.print(s, sp::convert);			//for non-static methods, use object reference name
		
	}
}

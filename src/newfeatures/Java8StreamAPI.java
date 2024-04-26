package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamAPI {
	public static void main(String[] args) {
		//stream = once the values are used we can't use again
		
//		List<LambdaStudent> ls = new ArrayList<>();
//		ls.add(new LambdaStudent(14, "Ritesh", 30));
//		ls.add(new LambdaStudent(16, "Ashish", 90));
//		ls.add(new LambdaStudent(11, "Mayank", 70));
//		ls.add(new LambdaStudent(19, "Hitesh", 40));
//
//		//Filtering Collection by using Stream
//		List<Integer> filteredList = ls.stream()
//				.filter(s->s.marks>50)			//filtering data
//				.map(p->p.marks)				//fetching data
//				.collect(Collectors.toList());	//collecting data
//		System.out.println(filteredList);
//
//		//Stream Iterating
//		Stream.iterate(1, element->element+1)
//			.filter(element->element%5==0)
//			.limit(5)
//			.forEach(System.out::println);
//
//		//Filtering and Iterating Collection
//		ls.stream()
//			.filter(s -> s.marks<50)
//			.forEach(s -> System.out.println(s.name));
//
//		//reduce() Method in Collection
//		Integer a1 = ls.stream()
//						.map(s -> s.marks)
//						.reduce(0, (sum, marks)->sum+marks);	// accumulating marks
//		System.out.println(a1);
//
//		Integer a2 = ls.stream()
//					.map(s -> s.marks)
//					.reduce(0, Integer::sum);	//accumulating marks, by referring method of Integer class
//		System.out.println(a2);
//
//		//Sum by using Collectors Methods
//		Integer a3 = ls.stream()
//						.collect(Collectors.summingInt(s->s.marks));
//		System.out.println(a3);
//
//		//Sum by using Collectors Methods
//		Double a5 = ls.stream()
//						.collect(Collectors.averagingInt(s->s.marks));
//		System.out.println(a5);
//
//		//count elements
//		Long a6 = ls.stream()
//						.collect(Collectors.counting());
//		System.out.println(a6);
//
//		//Find Max and Min values
//		LambdaStudent stmax = ls.stream()
//								.max((a,b)->a.marks>b.marks?1:-1)
//								.get();
//		System.out.println(stmax.marks);
//		LambdaStudent stmin = ls.stream()
//								.max((a,b)->a.marks<b.marks?1:-1)
//								.get();
//		System.out.println(stmin.marks);
//
//		//count() Method in Collection
//		int a4 = (int) ls.stream().filter(s->s.marks>33).count();
//		System.out.println(a4);
//
//		//Convert List into Set
//		Set<Integer> set1 = ls.stream().map(s->s.marks).collect(Collectors.toSet());
//		System.out.println(set1);
//
//		//Convert List into Map
//		Map<Integer,String> map1 = ls.stream()
//									.collect(Collectors.toMap(s->s.roll, s->s.name));
//		System.out.println(map1);
//
//		//Method Reference in stream
//
//
//
//
//
//
//
//
//		//Intermediate Operations:
//		List<Integer> number = Arrays.asList(2,3,4,5);
//		List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
//		System.out.println(square);
//
//		List<String> names = Arrays.asList("Reflection","Collection","Stream");
//		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//		System.out.println(result);
//
//		List<String> show = names.stream().sorted().collect(Collectors.toList());
//	    System.out.println(show);
//
//		//Terminal Operations:
//	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
//	    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
//	    System.out.println(squareSet);
//
//	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
//
//	    int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//	    System.out.println(even);
//
		
		
		
		
	}
}

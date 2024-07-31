package _04_collections;

import java.util.*;
import java.util.stream.Collectors;

class Domain{
	public int id;
	public String url;
	public Domain(int id, String url) {
		this.id = id;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Domain [id=" + id + ", url=" + url + "]";
	}
	//to use frequency method, we have to override equals method
	@Override
	public boolean equals(Object obj) {
		Domain d;
		if(obj instanceof Domain) {
			d = (Domain) obj;
			if(this.id==d.id && this.url.equals(d.url))
				return true;
		}
		return false;
	}
	
}
class SortById implements Comparator<Domain>{
	public int compare (Domain a, Domain b) {
		return a.id - b.id;
	}	
}

public class JavaCollections {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		
		List<Integer> al2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(al2);
		
		Collections.swap(al, 3, 1);
		System.out.println(al);
		
		Collections.reverse(al2);
		System.out.println("reverse list: "+al2);
		Collections.reverse(Arrays.asList(arr));
		System.out.println("reverse array: "+Arrays.toString(arr));		
		
		Collections.sort(al2);
		System.out.println("sort: "+al2);
		
		System.out.println(Collections.binarySearch(al2, 15));
		System.out.println(Collections.binarySearch(al2, 7));
		
		//comparator returned by Collections.reverseOrder() to sort a list in descending order.
		Collections.sort(al2, Collections.reverseOrder());
		System.out.println("reverse sort: "+al2);
		System.out.println(Collections.binarySearch(al2, 7, Collections.reverseOrder()));
		
		List<Domain> l = new ArrayList<Domain>();
        l.add(new Domain(10, "quiz.geeksforgeeks.org"));
        l.add(new Domain(20, "practice.geeksforgeeks.org"));
        l.add(new Domain(30, "code.geeksforgeeks.org"));
        l.add(new Domain(40, "www.geeksforgeeks.org"));
        System.out.println(Collections.binarySearch(l, new Domain(20, null), new SortById()));
		
        Collections.sort(l, new SortById());
		System.out.println(l);
		Collections.sort(l, Collections.reverseOrder(new SortById()));
		System.out.println(l);
		
		Collections.rotate(al2, 2);
		System.out.println("rotated right: "+al2);
		
		//two collections are disjoint if they have no elements in common.
		System.out.println(Collections.disjoint(al, Arrays.asList(arr)));
		
		//double brace initialization 
		Set<String> sets = new HashSet<String>()
        {
            {
                add("one");
                add("two");
                add("three");
            }
        };

        //frequency uses equals method to compare, so it will not work on primitive arrays
        System.out.println("The frequency of 2 is: "+ Collections.frequency(al2, 2)); 
        System.out.println("The frequency of domain is: "+ Collections.frequency(l, new Domain(10, "quiz.geeksforgeeks.org"))); 
        System.out.println("The frequency of 2 is: "+ Collections.frequency(Arrays.asList(arr), 3)); 
        Integer[] arr2 = {10, 20, 20, 30, 20, 40, 50};
        System.out.println("The frequency of 2 is: "+ Collections.frequency(Arrays.asList(arr2), 20));
	}
}

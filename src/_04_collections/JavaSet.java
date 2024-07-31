package _04_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {

	public static void main(String[] args) {
		//unordered collection of objects in which duplicate values cannot be stored
		Set<String> hs = new HashSet<String>();
		hs.add("Rishi");
		hs.add("Ashish");
		hs.add("Ranjan");
		hs.add("Mayank");
		hs.add("Ashish");			//duplicate
		System.out.println(hs);		//unordered
		
		Set<String> ts = new TreeSet<String>(hs);
		System.out.println(ts);		//sorted set 
		
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
		
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union: " + union);
		
		Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("intersection: "+intersection);
        
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference: "+difference);
		
        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("A");
        lh.add("B");
        lh.add("C");
        lh.add("D");
		System.out.println(lh);
		
		//EnumSet
		
	}
}

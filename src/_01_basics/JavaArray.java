package _01_basics;// package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArray {
	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,3};
		System.out.println(a1 == a2);				//compare reference
		System.out.println(a1.equals(a2));			//compare reference
		System.out.println(Arrays.equals(a1, a2));	//compare content
		
		Object[] obj1 = {a1};
		Object[] obj2 = {a2};
		System.out.println("Deep comp: " + Arrays.equals(obj1, obj2));	//Arrays.equals() is not able to do deep comparison
		System.out.println("Deep comp: " + Arrays.deepEquals(obj1, obj2));
		
		int[] arr = new int[10];	//fixed sized array // both primitive and objects
		ArrayList al = new ArrayList();	//Dynamic sized array // only objects
		al.add(3);
		al.add(1);
		al.add(6);
		al.add(10);
		al.add(5);
		Object[] obj = al.toArray();
		for(Object o : obj)
			System.out.println(o);
		
		int[] a3 = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		System.out.println(Arrays.toString(a3));
		
		Arrays.sort(a3);
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.binarySearch(a3, 7));
		//Arrays.sort(a3, Collections.reverseOrder());
		System.out.println(Arrays.toString(a3));
		
		int[] a4 = Arrays.copyOf(a3, 5);
		System.out.println(Arrays.toString(a4));
		int[] a5 = Arrays.copyOfRange(a3, 3, 6);
		System.out.println(Arrays.toString(a5));
		
		Arrays.fill(a3, 5);
		System.out.println(Arrays.toString(a3));
		Arrays.fill(a3, 3, 6, -1);
		System.out.println(Arrays.toString(a3));
		
		Integer a6[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		List<Integer> al1 = Arrays.asList(a6);	// Creates a wrapper list over ar[]
		System.out.println(al1);
		
		Object[] a7 = al1.toArray();
		System.out.println(Arrays.toString(a7));

		int[][] mat = new int[2][2];
        mat[0][0] = 99; mat[0][1] = 151; mat[1][0] = 30; mat[1][1] = 50;
        System.out.println(Arrays.toString(mat));
        System.out.println(Arrays.deepToString(mat));	//deep toString
        
        
		
	}
}

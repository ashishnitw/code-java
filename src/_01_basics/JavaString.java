package basics;// package coreJava;

import java.util.StringTokenizer;

public class JavaString {
	
	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		String s4 = new String("Cat");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);		//compares references not values
		System.out.println(s2.equals(s3));	//compares values of string for equality
		System.out.println(s2.compareTo(s3));	//compares values lexicographically
		
		System.out.println("String equality:");
		String a1 = "x";
		a1 += "yz";
		String a2 = "xy";
		a2 += "z";
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		String a3 = a1.intern();
		String a4 = a1.intern();
		System.out.println(a3==a4);	
		
		System.out.println(a3==a1);	
		System.out.println(a3==a2);	
		
		
		StringBuffer sb = new StringBuffer(s1);	// it is synchronized
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.reverse().append("Dog"));
		System.out.println(sb.insert(3, "&"));
		System.out.println(sb.replace(3, 4, "AND"));
		System.out.println(sb.delete(3, 6));
		
		StringBuilder sd = new StringBuilder();	// it is not synchronized, but faster
		
		StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
		while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
	    while (st2.hasMoreTokens())
	        System.out.println(st2.nextToken());
	    StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :",  true);
	    while (st3.hasMoreTokens())
	        System.out.println(st3.nextToken());
	    
	    //swap 2 string without using 3rd string
	    String a = "Hello";
        String b = "World";
        System.out.println("Strings before swap: a = " + a + " and b = "+b);
        a = a + b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("Strings before swap: a = " + a + " and b = "+b);
	    
	    //Counting number of lines, words, characters and paragraphs in a text file using Java
        
		
		
		
		
		
		
		
	}
}

// package misc;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JavaTricks {
	public static boolean isEven(int n) {
		return ((n & 1) == 0);
	}
	public static void swap(int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
	}
	public static boolean isPowerOfTwo(int x) {
		return (x!=0) && (x & (x-1)) == 0;
	}
	
	public static void main(String[] args) {
		int a = 4; int b = 5;
		System.out.println(isEven(a)); System.out.println(isEven(b));
		
		a = a<<2; System.out.println(a);	//multiply
		b = b>>1; System.out.println(b);	//divide
		
		swap(a,b); System.out.println(a + ", " + b);	//not swapped, always call by value in java
		
		a ^= b;
		b ^= a;
		a ^= b; System.out.println(a + ", " + b);
		
		int n = 123;
		//Calculating the most significant digit
		System.out.println( (int) Math.pow(10, Math.floor(Math.log10(n))));
		
		System.out.println( (int) Math.floor(Math.log10(n) + 1));	//Calculating the number of digits directly
		
		// to use gcd method of BigInteger class
		BigInteger bi1 = BigInteger.valueOf(a);
		BigInteger bi2 = BigInteger.valueOf(b);
		BigInteger gcd = bi1.gcd(bi2);
		System.out.println("GCD: " + gcd.intValue());
		
		//checking for a prime number:
		System.out.println("isPrime: " + BigInteger.valueOf(47).isProbablePrime(1));
		System.out.println("next Prime: " + BigInteger.valueOf(47).nextProbablePrime());
		
		//Efficient trick to know if a number is a power of 2
		System.out.println("a is power of 2: " + isPowerOfTwo(a));
		
		//Use Wrapper class functions for getting radix conversions of a number
		
		//executing comments
		// \u000d System.out.println("comment executed");
		//\u000d //Java compiler parses this unicode character as new line
		
		//named loop:
		loop1:
		    for (int i = 0; i < 5; i++)
		     {
		        for (int j = 0; j < 5; j++) 
		        {
		            if (i == 3)
		                break loop1;
		            System.out.println("i = " + i + " j = " + j);
		        }
		    }
		
		//swap
		int x = 3, y = 8;
		x = x ^ y ^ (y = x);
		System.out.println(x + "," + y);
		
		//java.util.Random
		Random rand = new Random();
		System.out.println(rand.nextInt(1000));	//Generate random integer in range 0 to 999
		System.out.println(rand.nextDouble());	//Generate Random doubles between 0 and 1

		//Math.random()
		System.out.println("Random double: " + Math.random());	//between 0 and 

		//java.util.concurrent.ThreadLocalRandom class
		System.out.println(ThreadLocalRandom.current().nextInt());	//any value
		System.out.println(ThreadLocalRandom.current().nextDouble());	//between 0 and 1
		System.out.println(ThreadLocalRandom.current().nextBoolean());	//true or false
		
		//trignometric functions in Math class
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		System.out.println("sin(" + degrees + ") = " + sin);
		System.out.println("cos(" + degrees + ") = " + cos);
		System.out.println("tan(" + degrees + ") = " + tan);
		
		//Java.util.BitSet class //It creates an array of bits represented by boolean values.
		//The size of the array is flexible and can grow to accommodate additional bit as needed.
		BitSet bs1 = new BitSet();
		BitSet bs2 = new BitSet(6);

		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(4);

		bs2.set(4);
		bs2.set(6);
		bs2.set(5);
		bs2.set(1);
		bs2.set(2);
		bs2.set(3);

		System.out.println("bs1  : " + bs1);
		System.out.println("bs2  : " + bs2);
		
		//System.out.println(2/0);	//Arithmetic exception
		//System.out.println(2%0);	//Arithmetic exception
		//Floating type doesn�t produces Exception while operating with mathematical values
		System.out.println(2.0%0);	//NaN
		System.out.println(2.0/0);	//Infinity
		System.out.println(0.0%0);	//NaN
		System.out.println(Math.sqrt(-1));	//NaN

		System.out.println(Float.NaN == Float.NaN);	//false
		System.out.println(Double.NaN == Double.NaN);	//false

		Double d = 2.0/0;
		System.out.println(d.isNaN());
		
	}
}

package basics;// package coreJava;

class PassByValueDemo{
	int x;
	PassByValueDemo(){
		this.x = 0;
	}
	PassByValueDemo(int x){
		this.x = x;
	}
	public static void change(int a) {
		a = 10;
	}
	public static void change(PassByValueDemo t) {
		t = new PassByValueDemo();
		t.x = 10;
	}
	public static void change2(PassByValueDemo t) {
		t.x = 10;
	}
	public static void fun(int ...a) {
		System.out.println("Number of arguments: " + a.length);
		for (int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
}

public class JavaMethods {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	public static void swap(Integer a, Integer b) {
		Integer temp = new Integer(a);
		a = b;
		b = temp;
	}
	
	public static void show(int x) {
		System.out.println("int: "+x);
	}
	public static void show(Integer x) {
		System.out.println("Integer: "+x);
	}
	public static void show(String x) {
		System.out.println("String: "+x);
	}
	public static void main(String[] args) {
		//In Java, parameters are always passed by value
		int x = 3; int y = 6;
		System.out.println("x = " + x + "; y = " + y);
		swap(x,y);
		System.out.println("x = " + x + "; y = " + y);
		
		Integer a = new Integer(3);
		Integer b = new Integer(6);
		System.out.println("a = " + a + "; b = " + b);
		swap(a,b);
		System.out.println("a = " + a + "; b = " + b);
		
		int c = 5;
		PassByValueDemo.change(c);
		System.out.println(c);
		PassByValueDemo t = new PassByValueDemo(5);
		PassByValueDemo.change(t);
		System.out.println(t.x);
		PassByValueDemo.change2(t);
		System.out.println(t.x);
		
		PassByValueDemo.fun(1, 2, 3, 4);
		
		show(3);
		String s = null;
		show(s);
		
		
		
		
		
		
		
		
		
		
	}
}

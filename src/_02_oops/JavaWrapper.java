package _02_oops;// package coreJava;

class WrapperDemo {
	
	
}
public class JavaWrapper {
	private static void doSomething(Object obj){
		System.out.println(obj.toString());
	}
	
	public static void main(String args[]){
		int i = 10;
		char c = 'a';
		
		//polymorphism achieved by Wrapper classes, we can't pass primitive here
		doSomething(new Character(c));
		doSomething(new Integer(i));
		
		Integer a1 = 10*10*10;
		Integer a2 = 100*10;
		System.out.println(a1==a2);			//false
		System.out.println(a1.equals(a2));	//true
		
		Integer a3 = 2*2*2;
		Integer a4 = 4*2;
		System.out.println(a3==a4);			//true
		System.out.println(a3.equals(a4));	//true
		
		
	}
}

package _02_oops;// package coreJava;

class Adder{
	public static int add(int a,int b) { return a+b;}
	public static int add(int a,int b,int c) { return a+b+c;}	//changing no. of arguments
	public static double add(double a, double b) {return a+b;}	//changing type of arguments
	//public static double add(int a,int b){return a+b;}  
	//Overloading is not possible by ONLY changing the return type of method because of ambiguity
	public static String function(String temp, int data) {return ("GFG");}
	public static String function(int data, String temp) {return ("GeeksforGeeks");}	//
	//The order of argument are an important parameter for determining method overloading. As the order of attributes are different, the methods are overloaded.
	
}
class Vehicle{
	int speed;
	public void run() {System.out.println("oops.Vehicle is running");}
	
	{	//to initialize data members and do other operations (called when object is created)
		speed = 100;
	}
}
class Car extends Vehicle{
	public void run() {super.run(); System.out.println("oops.Car is running");}
}
public class JavaPolymorphism {

	public static void main(String[] args) {
		System.out.println(Adder.add(3, 4));
		System.out.println(Adder.add(3, 4, 5));
		System.out.println(Adder.add(3.4, 5.6));
		
		System.out.println(Adder.function(4, "GFG"));
		
		
		//Type Promotion if no matching datatype is found
		System.out.println(Adder.add(3, 'a', 5));		//Type Promotion
		
		//overriding
		Car c = new Car();
		c.run();
		
		System.out.println(c instanceof Car);
		System.out.println(c instanceof Vehicle);
		
	}

}

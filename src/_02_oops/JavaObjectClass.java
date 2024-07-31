package _02_oops;// package coreJava;

public class JavaObjectClass {

	public static void main(String[] args) {
		//12 methods in Object class
		Object o = new Object();
		Object o2 = new Object();
		
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.equals(o2));
		System.out.println(o.getClass());	//Returns the class object of �this� object and used to get actual runtime class of the object
		o2 = null;
		System.gc();	//it calls finalize() on the object to be deleted
		
		//clone, wait, notify, notifyall
		
		//reference variable of type Object can be practically used to refer objects of any class
		Object y;
        y = 'A';
        System.out.println(y.getClass().getName());
        y = 1;
        System.out.println(y.getClass().getName());
        y = "Hi";
        System.out.println(y.getClass().getName());
        y = 1.222;
        System.out.println(y.getClass().getName());
        y = false;
        System.out.println(y.getClass().getName());
	}
}

package exceptions;// package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}

public class JavaException {
	public static void main(String[] args) throws IOException {
		//throws is used to suppress the error, using try catch is better practice
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//resource
		
		try {
			double d = 1.0;
			System.out.println(d/0);
			
			int a = 10/0;
			
			int[] arr = new int[4];
			int b = arr[3];
			
			String s = br.readLine();	//checked exception
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Unknown Exception");
		}
		finally {
			//br.close();
			System.out.println("finally... Bye");
		}
		
		//throw keyword
		try {
			int c = 5;
			if(c==5) {
				throw new ArithmeticException("Erorrrrrrrrrr");	//throw keyword
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//user defined exception
		try {
			int c = 5;
			if(c==5) {
				throw new MyException("Erorrrrrrrrrr");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//try-with-resources from Java 7 onwards
		try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))){
			//here we don't need catch and finally block
			String s2 = br2.readLine();
		}
		System.out.println("Multicatch.......");
		
		try {
			int f = 10/0;
		}
		catch(NumberFormatException | ArithmeticException e){
			System.out.println(e);
			//e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}
	}
}

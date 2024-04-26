package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleIO {
	public static void main(String[] args) throws ParseException {
		//Ways to read input from console in Java
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String con = System.console().readLine();
		
		//In Scanner class if we call nextLine() method after any one of the seven nextXXX() method 
		//then the nextLine() doesn�t not read values from console and cursor will not come into console it will skip that step
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
		
		//Formatted output in Java
		System.out.printf("%d \n", 12);
		System.out.printf("%f \n", Math.PI);
		System.out.printf("%.2f \n", Math.PI);		//precision
		System.out.printf("%.4f \n", 5.2);			//append 0 at end
		System.out.printf("%20.4f \n", 2324435.3);	//margin
		
		DecimalFormat ft = new DecimalFormat("####");	//only numeric part
		System.out.println("Without fraction part: num = " + ft.format(123.4567));
	    ft = new DecimalFormat("#.##");					// this will print it upto 2 decimal places
	    System.out.println("Formatted to Give precison: num = " + ft.format(123.4567));
	    ft = new DecimalFormat("#.000000");				// automatically appends zero to the rightmost part of decimal
	    System.out.println("appended zeroes to right: num = " + ft.format(123.4567));
	    ft = new DecimalFormat("00000.00");				// automatically appends zero to the leftmost of decimal number
	    System.out.println("formatting Numeric part : num = "+ft.format(123.4567));
	    ft = new DecimalFormat("$###,###.##");			// formatting money in dollars
	    System.out.println("your Formatted Dream Income : " + ft.format(23456.789));
		
	    SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
	    String str = dt.format(new Date());
	    System.out.println("Formatted Date : " + str);
	    str = "02/18/1995";
	    dt = new SimpleDateFormat("MM/dd/yyyy");
	    Date date = dt.parse(str);
	    System.out.println("Parsed Date : " + date);
		
	}
}

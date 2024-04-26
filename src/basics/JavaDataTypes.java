package basics;

public class JavaDataTypes {

	public static void main(String[] args) {
		System.out.println("Y" + "O");
        System.out.println('Y' + 'O');	//Widening Primitive Conversion in Java, widening primitive conversion happens only when �+� operator is present.
        System.out.print('Y');
        System.out.println('O');
        
        int a = 100;
        long b = a;		//automatic type conversion
        float c = b;	//automatic type conversion
        System.out.println("Int value "+a);
        System.out.println("Long value "+b);
        System.out.println("Float value "+c);
        
        double d = 100.04;	
        long e = (long)d;	//explicit type casting 
        int f = (int)e; 	//explicit type casting
        System.out.println("Double value "+d);
        System.out.println("Long value "+e); 
        System.out.println("Int value "+f); 
        
        byte g = 42; 
        char h = 'a'; 
        short i = 1024;
        int j = 50000;
        float k = 5.67f;
        double l = .1234;
        double result = (k * g) + (j / c) - (l * i);
        System.out.println("result = " + result);	//Result after all the promotions are done
        
        byte m = 50; 
        m = (byte)(b * 2);		//type casting int to byte
        System.out.println(m);

        int inum = 1_00_00_000;
        System.out.println("inum:" + inum);
        long lnum = 1_00_00_000;
        System.out.println("lnum:" + lnum);
        float fnum = 2.10_001F;
        System.out.println("fnum:" + fnum);
        double dnum = 2.10_12_001;
        System.out.println("dnum:" + dnum);
        
        
        
	}
}

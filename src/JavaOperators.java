// package coreJava;

interface OperInterface{}
class OperParent{}
class OperChild extends OperParent implements OperInterface{}

public class JavaOperators {
	public static void main(String[] args) {
		//bitwise operator
		int a = 0x0005;
        int b = 0x0007;
        System.out.println("a&b = " + (a & b));	//and
        System.out.println("a|b = " + (a | b));	//or
        System.out.println("a^b = " + (a ^ b));	//xor
        System.out.println("~a = " + ~a);		//not
        a &= b;
        System.out.println("a= " + a);
		
		//shift operators
        int c = 4;
        int d = -10;
        System.out.println("c << 2 = " + (c<<2));	//left shift
        System.out.println("c >> 1 = " + (c>>1));	//right shift
        System.out.println("d << 2 = " + (d>>>2));	//unsigned right shift
        
		//instanceof
        OperParent op = new OperParent();
        System.out.println(op instanceof OperParent);
        System.out.println(op instanceof OperChild);
        System.out.println(op instanceof OperInterface);
		OperChild oc = new OperChild();
        System.out.println(oc instanceof OperChild);
        System.out.println(oc instanceof OperParent);
        System.out.println(oc instanceof OperInterface);
        System.out.println(null instanceof OperInterface);	//returns false
        OperParent pc = new OperChild();	//A parent reference referring to a Child is an instance of Child
        System.out.println(pc instanceof OperChild);
        
		//Precedence and Associativity
        int e = 2;
        int f = 4;
        int g = e+++f;
        System.out.println("e+++f = " + g);
		
        //compiler evaluates the given expression from left to right given that the operators have same precedence.
        System.out.println(e + f + " concatenation = " + e + f);
        System.out.println(e + f + " addition = " + (e + f));		//always use () in system.out.println()
        
        Integer x = 400, y = 400;
        System.out.println(x==y);		//false, Since x and y refer to different objects, we get the output as �Not Same�
		Integer x1 = 40, y1 = 40;
		System.out.println(x1==y1);		//true, In Java, values from -128 to 127 are cached, so the same objects are returned. The implementation of valueOf() uses cached objects if the value is between -128 to 127.
		Integer x2 = new Integer(40), y2 = new Integer(40);
		System.out.println(x2==y2);		//false, If we explicitly create Integer objects using new operator, we get the output as �Not Same�.
		Integer X3 = new Integer(10); Integer Y3 = 10;
		System.out.println(X3 == Y3);	//false, Two objects will be created here. First object which is pointed by X due to calling of new operator and second object will be created because of Auto-boxing.
        
        
        
	}
}

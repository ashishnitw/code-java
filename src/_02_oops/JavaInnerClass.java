package oops;// package coreJava;

//member inner class
class InnerMember{
	int roll;
	String name;
	class StudentAddress{
		public void show() {
			//inner class methods can't be static
			System.out.println("Show : Member");
		}
	}
}
//nested inner class
class InnerNested{
	static class StudentAddress{
		public void show() {
			System.out.println("Show : Nested");
		}
	}
}
//anonymous inner class
class InnerAnonymous{
	public void show() {
		System.out.println("Show : Outer");
	}
}
//Lambda
@FunctionalInterface
interface InnerLambda{
	//functional interface
	void show();
}

public class JavaInnerClass {
	public void print() {
        //local inner class inside the method
        class Logger {
            String name;
        }
        //instantiate local inner class in the method to use
        Logger logger = new Logger();
	}
	public static void main(String[] args) {
		InnerMember a = new InnerMember();
		InnerMember.StudentAddress b = a.new StudentAddress();
		b.show();
		
		InnerNested.StudentAddress d = new InnerNested.StudentAddress();
		d.show();
		
		InnerAnonymous c = new InnerAnonymous() {
			//this block becomes anonymous class, .class file is not generated for this
			public void show() {
				System.out.println("Show : Anonymous");
			}
		};
		c.show();
		
		InnerLambda e = () -> {System.out.println("Show : Lambda");};
		e.show();
		
		
		
	}
}

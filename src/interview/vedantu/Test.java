package interview.vedantu;

public class Test {
  public static void main(String[] args){
    Child c=new Child();
  }
}

abstract class Base {

  Base() {
    overrideMe();
    populate();
  }

  abstract void overrideMe();

  void populate() {
    System.out.println("in super class" + this.getClass().toString());
  }
}

class Child extends Base {

  Child() {
    System.out.println("In child class constructor");
    overrideMe();
    populate();
  }

  @Override
  void overrideMe() {
    System.out.println("In child class overrideMe method");
  }

  @Override
  void populate() {
    System.out.println("In child class populate method");
  }
}



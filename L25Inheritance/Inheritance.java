package L25Inheritance;

public class Inheritance {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();
    dog.sleep();
    dog.bark();
    dog.showName();
  }
}

class Animal {
  String name = "animal";
  public void eat() {
    System.out.println("eating");
  }

  public void sleep() {
    System.out.println("Zzz");
  }

  public void showName() {
    System.out.println(name);
  }
}

class Dog extends Animal {

  public void eat() {
    System.out.println("dog eating");
  }

  public void bark() {
    System.out.println("barking");
  }
}
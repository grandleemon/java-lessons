package L29Polymorphism;

public class Polymorphism {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();
    test(animal);
    test(dog);
    test(cat);
  }

  public static void test(Animal animal) {
    animal.eat();
  }
}

class Animal {
  public void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("dog is eating");
  }

  public void sleep() {
    System.out.println("sleeping");
  }
}

class Cat extends Animal {}
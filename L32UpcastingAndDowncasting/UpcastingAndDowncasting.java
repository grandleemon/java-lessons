package L32UpcastingAndDowncasting;

public class UpcastingAndDowncasting {
  public static void main(String[] args) {
    //Upcasting
    Animal animal = new Dog();

    //Downcasting
    Dog dog = (Dog) new Animal();
  }
}

class Animal {
  public void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal{
  public void bark() {
    System.out.println("barking");
  }
}

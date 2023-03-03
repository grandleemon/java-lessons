package L34Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal(2));
    animals.add(new Animal(3));

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog());
    dogs.add(new Dog());

    test(animals);
    test(dogs);
  }

  private static void test(List<? extends Animal> animals) {
    for(Animal animal : animals) {
      System.out.println(animal);
    }
  }
}

class Animal {
  private int id;

  public Animal() {

  }

  public Animal(int id) {
    this.id = id;
  }

  public String toString() {
    return String.valueOf(id);
  }

  public void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("barking");
  }
}

package L26Interfaces;

public class Interfaces {
  public static void main(String[] args) {
    Info info = new Animal(1);
    Info info1 = new Person("bob");
    info.showInfo();
  }
}

class Animal implements Info{
  public int id;

  public Animal(int id) {
    this.id = id;
  }

  public void sleep() {
    System.out.println("sleeping");
  }

  public void showInfo() {
    System.out.println(id);
  }
}

class Person implements Info{
  public String name;

  public Person(String name) {
    this.name = name;
  }

  public void sayHello() {
    System.out.println("hi");
  }

  public void showInfo() {
    System.out.println(name);
  }
}

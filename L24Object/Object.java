package L24Object;

public class Object {
  public static void main(String[] args) {
    Human human1 = new Human("bob", 2);
    System.out.println(human1.toString());
  }
}

class Human {
  private String name;
  private int age;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + age;
  }
}
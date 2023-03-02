package L20Constructors;

public class Constructors {
  public static void main(String[] args) {
    Human human1 = new Human("test", 20);
  }
}

class Human {
  private String name;
  private int age;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

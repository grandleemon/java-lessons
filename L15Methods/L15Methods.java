package L15Methods;

public class L15Methods {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.age = 20;
    person1.name = "test";
    person1.speak();
  }
}

class Person {
  String name;
  int age;

  void speak() {
    System.out.println("Name " + name + ", age " + age);
  }
}

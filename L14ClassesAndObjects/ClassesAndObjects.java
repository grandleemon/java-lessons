package L14ClassesAndObjects;

public class ClassesAndObjects {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.age = 20;
    person1.name = "test";
    System.out.println(person1.name + person1.age);
  }
}

class Person {
  String name;
  int age;
}

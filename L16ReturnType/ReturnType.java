package L16ReturnType;

public class ReturnType {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.age = 20;
    person1.name = "test";
    int year = person1.calculateYearsToRetirement();
    System.out.println(year);
  }
}

class Person {
  String name;
  int age;

  int calculateYearsToRetirement() {
    return 65 - age;
  }

  void speak() {
    System.out.println("Name " + name + ", age " + age);
  }
}

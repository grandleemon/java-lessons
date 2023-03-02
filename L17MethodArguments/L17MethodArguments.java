package L17MethodArguments;

public class L17MethodArguments {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.age = 20;
    person1.setName("test");
    int year = person1.calculateYearsToRetirement();
    System.out.println(year);
  }
}

class Person {
  String name;
  int age;

  void setName(String name) {
    this.name = name;
  }

  int calculateYearsToRetirement() {
    return 65 - age;
  }

  void speak() {
    System.out.println("Name " + name + ", age " + age);
  }
}
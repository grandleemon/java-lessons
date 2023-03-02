package L17MethodArguments;

public class L17MethodArguments {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setAge(20);
    person1.setName("test");
    person1.speak();
  }
}

class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(name.isEmpty()) {
      System.out.println("Empty");
      return;
    }
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age < 0) {
      System.out.println("Less than 0");
      return;
    }
    this.age = age;
  }

  int calculateYearsToRetirement() {
    return 65 - age;
  }

  void speak() {
    System.out.println("Name " + name + ", age " + age);
  }
}
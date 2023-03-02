package L20Constructors;

public class Constructors {
  public static void main(String[] args) {
    Human.description = "test";
    Human human1 = new Human("bob", 33);
    human1.printNumberOfPeople();
    Human human2 = new Human("bob", 33);
    human2.printNumberOfPeople();
    human1.getAllFields();
  }
}

class Human {
  private String name;
  private int age;
  public static String description;
  public static int countPeople;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
    countPeople++;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void getAllFields() {
    System.out.println(name + age + description);
  }
  public void printNumberOfPeople() {
    System.out.println(countPeople);
  }
}

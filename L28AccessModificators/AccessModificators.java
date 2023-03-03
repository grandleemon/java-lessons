package L28AccessModificators;

import L28AccessModificators.Package1.Person;

public class AccessModificators {
  public static void main(String[] args) {
    Person person1 = new Person();
    System.out.println(person1.name); // err without extending
  }
}

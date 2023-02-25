package L10Switch;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = scanner.nextInt();
    switch(age) {
      case 0:
        System.out.println(0);
        break;
      case 7:
        System.out.println(7);
        break;
      default:
        System.out.println("default");
    }
  }
}

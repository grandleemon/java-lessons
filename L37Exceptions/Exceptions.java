package L37Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
    File file = new File("dasd");

    try {
      Scanner scanner = new Scanner(file);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }

    System.out.println("after try catch");
  }
}

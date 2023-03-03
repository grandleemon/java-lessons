package L36ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
  public static void main(String[] args) throws FileNotFoundException {
    String separator = File.separator;
    String path = "D:" + separator + "JavaLessons" + separator + "test.txt";
    File file = new File(path);

    Scanner scanner = new Scanner(file);
    String line = scanner.nextLine();
    String[] strings = line.split(" ");
    int[] numbers = new int[3];
    int index = 0;

    for(String string : strings) {
      numbers[index++] = Integer.parseInt(string);
    }

    System.out.println(Arrays.toString(numbers));

    scanner.close();
  }
}
